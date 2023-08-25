package co.com.fonyou.servicioexamenes.service.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.servicioexamenes.entity.AnswerExamResponse;
import co.com.fonyou.servicioexamenes.entity.AnswerReport;
import co.com.fonyou.servicioexamenes.entity.ExamDTO;
import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.QuestionExamDTO;
import co.com.fonyou.servicioexamenes.entity.Student;
import co.com.fonyou.servicioexamenes.entity.StudentResponse;
import co.com.fonyou.servicioexamenes.repository.ExamDTORepository;
import co.com.fonyou.servicioexamenes.repository.QuestionExamRepository;
import co.com.fonyou.servicioexamenes.repository.QuestionRepository;
import co.com.fonyou.servicioexamenes.repository.StudentRepository;
import co.com.fonyou.servicioexamenes.service.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ExamDTORepository examDTORepository;
	
	@Autowired
	private QuestionExamRepository questionExamRepository;
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public StudentResponse create(Student student) {

		Student saved = studentRepository.save(student);

		StudentResponse resp = new StudentResponse("Se ha registrado con exito el estudiante!", saved);

		return resp;
	}

	@Override
	public Optional<Student> findById(int id) {
		
		Optional<Student> finded = studentRepository.findById(id);
		
		
		return finded;
	}

	@Override
	public AnswerExamResponse getAnswersByStudent(int idStudent) {
		
		AnswerExamResponse answerExamResponse = new AnswerExamResponse();
		
		answerExamResponse.setFirstName(studentRepository.findById(idStudent).get().getName());
		
		ExamDTO exam =  examDTORepository.findExamByStudent(idStudent).get();
		
		answerExamResponse.setScore(exam.getScore());
		
		List<QuestionExamDTO> questionExamDTOs = questionExamRepository.findByExam(exam.getId());
		
		List<AnswerReport> listAnswers = new ArrayList<>();
		
		for (int i = 0 ; i< questionExamDTOs.size() ; i++) {
			
			Question q = questionRepository.findById(questionExamDTOs.get(i).getId_question()).get();
			
			AnswerReport report = new AnswerReport();
			
			report.setOptionSelected(questionExamDTOs.get(i).getOption_selected());
			
			
			report.setQuestion(q.getDescription());
			
			listAnswers.add(report);
			
		}
		
		
		answerExamResponse.setAnswersReports(listAnswers);
		
		return answerExamResponse;
	}

}

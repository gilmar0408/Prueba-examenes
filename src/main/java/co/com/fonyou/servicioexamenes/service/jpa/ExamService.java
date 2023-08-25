package co.com.fonyou.servicioexamenes.service.jpa;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.servicioexamenes.entity.AnswerExamRequest;
import co.com.fonyou.servicioexamenes.entity.AnswerQuestion;
import co.com.fonyou.servicioexamenes.entity.Exam;
import co.com.fonyou.servicioexamenes.entity.ExamDTO;
import co.com.fonyou.servicioexamenes.entity.ExamFormat;
import co.com.fonyou.servicioexamenes.entity.ExamResponse;
import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.QuestionExamDTO;
import co.com.fonyou.servicioexamenes.entity.QuestionFormat;
import co.com.fonyou.servicioexamenes.entity.Score;
import co.com.fonyou.servicioexamenes.entity.Student;
import co.com.fonyou.servicioexamenes.repository.ExamDTORepository;
import co.com.fonyou.servicioexamenes.repository.ExamRepository;
import co.com.fonyou.servicioexamenes.repository.QuestionExamRepository;
import co.com.fonyou.servicioexamenes.repository.QuestionRepository;
import co.com.fonyou.servicioexamenes.repository.StudentRepository;
import co.com.fonyou.servicioexamenes.service.IExamService;

@Service
public class ExamService implements IExamService {

	@Autowired
	private ExamRepository examRepository;

	@Autowired
	private ExamDTORepository examDTORepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private QuestionExamRepository questionExamRepository;

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public ExamResponse create(Exam exam) {

		Exam savedFirst = examRepository.save(exam);

		ExamDTO saved = new ExamDTO();

		saved.setId(savedFirst.getId());
		saved.setScore(0);
		saved.setStudent(exam.getStudent());

		ExamResponse resp = new ExamResponse("Se ha creado con exito el examen!", saved);

		return resp;
	}

	@Override
	public ExamFormat getExamByStudent(int id) {

		ExamFormat format = new ExamFormat();

		Student student = studentRepository.findById(id).get();

		format.setStudentId(student.getId());
		format.setStudentName(student.getName());

		ExamDTO finded = examDTORepository.findExamByStudent(id).get();

		List<QuestionExamDTO> listIdQuestion = questionExamRepository.findByExam(finded.getId());

		List<QuestionFormat> questionListFormat = new ArrayList<>();

		for (QuestionExamDTO questionExamDTO : listIdQuestion) {

			QuestionFormat q = new QuestionFormat();

			Question quest = questionRepository.findById(questionExamDTO.getId_question()).get();

			q.setId_q(quest.getId());
			q.setDescription_q(quest.getDescription());
			q.setOption_a(quest.getOption_a());
			q.setOption_b(quest.getOption_b());
			q.setOption_c(quest.getOption_c());
			q.setOption_d(quest.getOption_d());

			questionListFormat.add(q);

		}

		format.setQuestions(questionListFormat);

		return format;
	}

	@Override
	public Score answerExam(AnswerExamRequest req) {

		double questionNumber = req.getAnswers().size();

		int numberCorrect = 0;

		for (AnswerQuestion a : req.getAnswers()) {

			Question finded = questionRepository.findById(a.getIdQuestion()).get();

			if (finded.getCorrect_option().equalsIgnoreCase(a.getSelected())) {

				numberCorrect++;

			}

		}
		
		System.out.println("Question Number: " + questionNumber);
		System.out.println("Number correct: " + numberCorrect);

		int score;

		if (numberCorrect != 0) {

			score = (int) (100 / (questionNumber / numberCorrect));

		} else {

			score = 0;

		}

		ExamDTO examDTO = examDTORepository.findExamByStudent(req.getIdStudent()).get();

		examDTO.setScore(score);

		examDTORepository.save(examDTO);

		Score finalScore = new Score();

		finalScore.setFirstName(studentRepository.findById(req.getIdStudent()).get().getName());
		finalScore.setIdStudent(req.getIdStudent());
		finalScore.setScore(score);

		int idExam = examDTO.getId();

		List<QuestionExamDTO> listQuestionExam = questionExamRepository.findByExam(idExam);
		
		
		for (int i = 0 ; i<req.getAnswers().size();i++) {
			
			listQuestionExam.get(i).setOption_selected(req.getAnswers().get(i).getSelected());
			
			questionExamRepository.save(listQuestionExam.get(i));
		}
		
		

		return finalScore;
	}

}

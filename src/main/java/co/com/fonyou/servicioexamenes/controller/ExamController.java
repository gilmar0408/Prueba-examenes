package co.com.fonyou.servicioexamenes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.servicioexamenes.entity.AnswerExamRequest;
import co.com.fonyou.servicioexamenes.entity.Exam;
import co.com.fonyou.servicioexamenes.entity.ExamFormat;
import co.com.fonyou.servicioexamenes.entity.ExamRequest;
import co.com.fonyou.servicioexamenes.entity.ExamResponse;
import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.Score;
import co.com.fonyou.servicioexamenes.entity.Student;
import co.com.fonyou.servicioexamenes.service.IExamService;
import co.com.fonyou.servicioexamenes.service.IQuestionService;
import co.com.fonyou.servicioexamenes.service.IStudentService;

@RestController
@RequestMapping("api/exam")
public class ExamController {

	@Autowired
	private IExamService iExamService;

	@Autowired
	private IStudentService iStudentService;

	@Autowired
	private IQuestionService iQuestionService;

	@PostMapping("/create")
	public ResponseEntity<ExamResponse> create(@RequestBody ExamRequest examRequest) {

		Exam exam = new Exam();

		Student est = iStudentService.findById(examRequest.getIdEstudiante()).get();

		List<Question> listQ = new ArrayList<>();

		for (Integer id : examRequest.getQuestions()) {

			listQ.add(iQuestionService.findById(id).get());

		}

		exam.setStudent(est);
		exam.setQuestions(listQ);

		ExamResponse resp = iExamService.create(exam);

		return new ResponseEntity<ExamResponse>(resp, HttpStatus.CREATED);
	}
	
	@GetMapping("/getByStudent/{id}")
	public ResponseEntity<ExamFormat> getExamByStudent (@PathVariable("id") int id){
		
		ExamFormat finded = iExamService.getExamByStudent(id);
		
		return new ResponseEntity<ExamFormat>(finded, HttpStatus.OK);
	}
	
	
	
	@PostMapping("/answerExam")
	public ResponseEntity<Score> answerExam (@RequestBody AnswerExamRequest request){
		
		return new ResponseEntity<Score>(iExamService.answerExam(request), HttpStatus.OK);
	}

}

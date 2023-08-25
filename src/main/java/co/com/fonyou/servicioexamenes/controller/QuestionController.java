package co.com.fonyou.servicioexamenes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.QuestionRequest;
import co.com.fonyou.servicioexamenes.entity.QuestionResponse;
import co.com.fonyou.servicioexamenes.service.IQuestionService;

@RestController
@RequestMapping("api/question")
public class QuestionController {

	@Autowired
	private IQuestionService iQuestionService;

	@PostMapping("/create")
	public ResponseEntity<QuestionResponse> create(@RequestBody QuestionRequest questionRequest) {

		Question question = new Question();

		question.setCorrect_option(questionRequest.getOptionOk());
		question.setDescription(questionRequest.getDescription());
		question.setOption_a(questionRequest.getOptionA());
		question.setOption_b(questionRequest.getOptionB());
		question.setOption_c(questionRequest.getOptionC());
		question.setOption_d(questionRequest.getOptionD());

		QuestionResponse resp = iQuestionService.create(question);

		return new ResponseEntity<QuestionResponse>(resp, HttpStatus.CREATED);
	}

}

package co.com.fonyou.servicioexamenes.service;

import java.util.Optional;

import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.QuestionResponse;

public interface IQuestionService {
	
	QuestionResponse create (Question question);
	
	Optional<Question> findById(int id);

}

package co.com.fonyou.servicioexamenes.service.jpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.fonyou.servicioexamenes.entity.Question;
import co.com.fonyou.servicioexamenes.entity.QuestionResponse;
import co.com.fonyou.servicioexamenes.repository.QuestionRepository;
import co.com.fonyou.servicioexamenes.service.IQuestionService;

@Service
public class QuestionService implements IQuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public QuestionResponse create(Question question) {

		Question saved = questionRepository.save(question);

		QuestionResponse resp = new QuestionResponse("Se ha creado con exito la pregunta!", saved);

		return resp;
	}

	@Override
	public Optional<Question> findById(int id) {
		
		Optional<Question> finded = questionRepository.findById(id);
		
		return finded;
	}

}

package co.com.fonyou.servicioexamenes.entity;

public class QuestionResponse {
	
	private String message;
	
	private Question question;

	public QuestionResponse(String message, Question question) {
		super();
		this.message = message;
		this.question = question;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuestionResponse [message=" + message + ", question=" + question + "]";
	}
	
	
}

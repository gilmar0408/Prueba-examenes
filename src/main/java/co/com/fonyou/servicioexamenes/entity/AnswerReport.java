package co.com.fonyou.servicioexamenes.entity;

public class AnswerReport {
	
	private String question;
	
	private String optionSelected;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionSelected() {
		return optionSelected;
	}

	public void setOptionSelected(String optionSelected) {
		this.optionSelected = optionSelected;
	}

	@Override
	public String toString() {
		return "AnswerReport [question=" + question + ", optionSelected=" + optionSelected + "]";
	}
	
	
	

}

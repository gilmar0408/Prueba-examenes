package co.com.fonyou.servicioexamenes.entity;

public class QuestionRequest {

	private String description;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String optionOk;
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getOptionOk() {
		return optionOk;
	}
	public void setOptionOk(String optionOk) {
		this.optionOk = optionOk;
	}
	@Override
	public String toString() {
		return "QuestionRequest [description=" + description + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + ", optionOk=" + optionOk + "]";
	}
	
	

}

package co.com.fonyou.servicioexamenes.entity;

public class ExamResponse {
	
	private String message;
	private ExamDTO exam;
	
	
	public ExamResponse(String message, ExamDTO exam) {
		super();
		this.message = message;
		this.exam = exam;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ExamDTO getExam() {
		return exam;
	}
	public void setExam(ExamDTO exam) {
		this.exam = exam;
	}
	@Override
	public String toString() {
		return "ExamResponse [message=" + message + ", exam=" + exam + "]";
	}
	
	
	

}

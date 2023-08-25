package co.com.fonyou.servicioexamenes.entity;

public class StudentResponse {
	
	private String message;
	
	private Student student;

	public StudentResponse(String message, Student student) {
		super();
		this.message = message;
		this.student = student;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentResponse [message=" + message + ", student=" + student + "]";
	}
	

}

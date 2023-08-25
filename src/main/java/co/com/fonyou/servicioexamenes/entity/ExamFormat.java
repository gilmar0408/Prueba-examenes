package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

public class ExamFormat {

	private int studentId;
	private String studentName;

	private List<QuestionFormat> questions;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<QuestionFormat> getQuestions() {
		return questions;
	}

	public void setQuestions(List<QuestionFormat> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ExamFormat [studentId=" + studentId + ", studentName=" + studentName + ", questions=" + questions + "]";
	}

}

package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

public class AnswerExamRequest {
	
	private int idStudent;
	
	private List<AnswerQuestion> answers;

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public List<AnswerQuestion> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerQuestion> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "AnswerExamRequest [idStudent=" + idStudent + ", answers=" + answers + "]";
	}
	
	

}

package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

public class AnswerExamResponse {

	private String firstName;

	private List<AnswerReport> answersReports;

	private int score;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<AnswerReport> getAnswersReports() {
		return answersReports;
	}

	public void setAnswersReports(List<AnswerReport> answersReports) {
		this.answersReports = answersReports;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "AnswerExamResponse [firstName=" + firstName + ", answersReports=" + answersReports + ", score=" + score
				+ "]";
	}

}

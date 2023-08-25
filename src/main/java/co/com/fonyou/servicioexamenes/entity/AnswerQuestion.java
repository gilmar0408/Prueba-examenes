package co.com.fonyou.servicioexamenes.entity;

public class AnswerQuestion {
	
	private int idQuestion;
	
	private String selected;

	public int getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getSelected() {
		return selected;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "AnswerQuestion [idQuestion=" + idQuestion + ", selected=" + selected + "]";
	}
	
	

}

package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

public class ExamRequest {
	
	private int idEstudiante;
	
	private List<Integer> questions;

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public List<Integer> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Integer> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "ExamRequest [idEstudiante=" + idEstudiante + ", questions=" + questions + "]";
	}
	
	

}

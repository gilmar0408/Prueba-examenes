package co.com.fonyou.servicioexamenes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question_exam")
public class QuestionExamDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int id_question;
	
	private int id_exam;
	
	private String option_selected;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_question() {
		return id_question;
	}

	public void setId_question(int id_question) {
		this.id_question = id_question;
	}

	public int getId_exam() {
		return id_exam;
	}

	public void setId_exam(int id_exam) {
		this.id_exam = id_exam;
	}

	public String getOption_selected() {
		return option_selected;
	}

	public void setOption_selected(String option_selected) {
		this.option_selected = option_selected;
	}

	@Override
	public String toString() {
		return "QuestionExamDTO [id=" + id + ", id_question=" + id_question + ", id_exam=" + id_exam
				+ ", option_selected=" + option_selected + "]";
	}


}

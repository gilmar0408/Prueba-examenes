package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String description;

	private String option_a;

	private String option_b;

	private String option_c;

	private String option_d;

	private String correct_option;

	@ManyToMany(mappedBy = "questions")
	private List<Exam> exams;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOption_a() {
		return option_a;
	}

	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}

	public String getOption_b() {
		return option_b;
	}

	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}

	public String getOption_c() {
		return option_c;
	}

	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}

	public String getOption_d() {
		return option_d;
	}

	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}

	public String getCorrect_option() {
		return correct_option;
	}

	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", option_a=" + option_a + ", option_b="
				+ option_b + ", option_c=" + option_c + ", option_d=" + option_d + ", correct_option=" + correct_option
				+ ", exams=" + exams + "]";
	}

}

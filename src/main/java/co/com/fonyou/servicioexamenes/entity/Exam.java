package co.com.fonyou.servicioexamenes.entity;

import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@OneToOne
	@JoinColumn(name = "student")
	private Student student;
	
	@Nullable
	private int score;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
	@JoinTable(name="question_exam" , joinColumns = @JoinColumn(name="id_exam", referencedColumnName = "id"),
	           inverseJoinColumns = @JoinColumn(name="id_question", referencedColumnName = "id"))
	private List<Question> questions;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", student=" + student + ", score=" + score + ", questions=" + questions + "]";
	}
	

}

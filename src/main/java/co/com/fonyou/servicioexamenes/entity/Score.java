package co.com.fonyou.servicioexamenes.entity;

public class Score {
	
	private int idStudent;
	
	private String firstName;
	
	private int score;

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [idStudent=" + idStudent + ", firstName=" + firstName + ", score=" + score + "]";
	}
	
	

}

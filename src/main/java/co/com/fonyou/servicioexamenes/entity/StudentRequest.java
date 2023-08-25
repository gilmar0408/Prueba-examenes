package co.com.fonyou.servicioexamenes.entity;

public class StudentRequest {
	
	private String firstName;
	
	private int age;
	
	private String city;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentRequest [firstName=" + firstName + ", age=" + age + ", city=" + city + "]";
	}
	
	
	

}

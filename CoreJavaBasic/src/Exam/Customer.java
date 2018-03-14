package Exam;

public class Customer {
	private Integer id;
	private Integer age;
	private String FirstName;
	private String LastName;
	
	public Customer(Integer id, Integer age, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		FirstName = firstName;
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", age=" + age + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
	
	
	
	

}

package ComparatorHw;

public class Employee  {
	private String firstName;
	private String lastName;
	private Long mobile;
	private Integer age;
	private String Accno;
	public Employee(String firstName, String lastName, Long mobile, Integer age, String accno) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.age = age;
		Accno = accno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ", age=" + age
				+ ", Accno=" + Accno + "]";
	}
	
	
	

}

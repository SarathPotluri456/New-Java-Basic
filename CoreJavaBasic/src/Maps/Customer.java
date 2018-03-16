package Maps;

public class Customer {
	private Integer rollno;
	private String name;
	private Integer sal;
	
	
	
	
	public Customer(Integer rollno, String name, Integer sal) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.sal = sal;
	}




	public Integer getRollno() {
		return rollno;
	}




	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getSal() {
		return sal;
	}




	public void setSal(Integer sal) {
		this.sal = sal;
	}




	@Override
	public String toString() {
		return "Customer [rollno=" + rollno + ", name=" + name + ", sal=" + sal + "]";
	}
	

}

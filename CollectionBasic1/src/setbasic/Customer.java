package setbasic;

public class Customer implements Comparable{
	
	private Integer accNo;
	private String name;
	private Integer age;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer accNo, String name, Integer age) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.age = age;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		
		Customer c = (Customer) o;
		
		int nameCompare = this.name.compareTo(c.getName());
		
		return nameCompare;
	}
	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

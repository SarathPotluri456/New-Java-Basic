package Assignment;

public class Customer implements Comparable {
 private Integer rollno;
 private String name;
 private Integer age;
 public Customer(Integer rollno, String name, Integer sal) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = sal;
}
@Override
public String toString() {
	return "Customer [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
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
	return age;
}
public void setSal(Integer sal) {
	this.age= sal;
}
@Override
public int compareTo(Object o) {
	Customer c1=(Customer) o;
	if(this.getName().equals(c1.getName()))
	{
		return this.getSal().compareTo(c1.getSal());
		
	}
	return this.getName().compareTo(c1.getName());	
	
	
}

 
}

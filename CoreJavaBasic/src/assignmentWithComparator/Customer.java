package assignmentWithComparator;

public class Customer {
 private Integer rollno;
 private String name;
 private Integer age;
 
public Customer(Integer rollno, String name, Integer age) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
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
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}


 
}

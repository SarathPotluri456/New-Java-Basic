package Maps;

public class Student  {
int rollno;
String name;
int age;
public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

Student(int rollno,String name,int age)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	
}
	
	
    @Override
	public String toString()
	{
		return " Rollno:"+rollno+" Name:"+name+" Age:"+age;
	}
}

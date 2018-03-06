package ComparableCheck;

public class Student implements Comparable<Student> {
int rollno;
String name;
int age;
Student(int rollno,String name,int age)
{
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	
}
	
	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else if(age<o.age)
			return 1;
		else
			return -1;
	}
    @Override
	public String toString()
	{
		return " Rollno:"+rollno+" Name:"+name+" Age:"+age;
	}
}

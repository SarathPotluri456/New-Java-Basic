package ComparableCheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Client {

	public static void main(String[] args) {
		/*ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1,"sarath",24));
		al.add(new Student(2,"babu",23));
		al.add(new Student(3,"potluri",19));
		Collections.sort(al);*/
		TreeSet<Student> al=new TreeSet<Student>();
		al.add(new Student(1,"sarath",24));
		al.add(new Student(2,"babu",23));
		al.add(new Student(3,"potluri",19));
		System.out.println(al);
		/*for(Student ob:al)
		{
			System.out.println(ob.name+" "+ob.rollno+" "+ob.age);
		}
*/
	}

}

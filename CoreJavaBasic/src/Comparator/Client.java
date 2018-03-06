package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
 public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(2,"sarath",24));
	al.add(new Student(3,"babu",25));
	al.add(new Student(1,"potluri",34));
	System.out.println("Name wise Sorting:");
	Collections.sort(al, new NameComparator());
	for(Student s:al)
	{
		System.out.println("Roll No:"+s.rollno+" "+"Name:"+s.name+" "+"Age"+s.age);
	}
	System.out.println("Age wise Sorting:");
	Collections.sort(al,new AgeComaprator());
	for(Student s:al)
	{
		System.out.println("Roll No:"+s.rollno+" "+"Name:"+s.name+" "+"Age"+s.age);
	}
}
}

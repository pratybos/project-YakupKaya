import java.util.*;
import java.io.*;

/*
Java Comparator interface is used to order the objects of a user-defined class.

This interface is found in java.util package and contains 2 methods
 compare(Object obj1,Object obj2) and equals(Object element).

It provides multiple sorting sequences, i.e., you can sort the elements
 on the basis of any data member, for example, rollno, name, age or anything else.
 
 */

class Simple{
public static void main(String args[]){
	
	ArrayList al=new ArrayList();
	al.add(new Student(101,"Yakup",23));
	al.add(new Student(106,"Kaya",27));
	al.add(new Student(105,"Java",21));
	
	System.out.println("Sorting by Name");
	
	Collections.sort(al,new NameComparator());
	Iterator itr=al.iterator();
	while(itr.hasNext()){
		Student st=(Student)itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
	System.out.println("Sorting by age");
	
	Collections.sort(al,new AgeComparator());
	Iterator itr2=al.iterator();
	while(itr2.hasNext()){
		Student st=(Student)itr2.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
	
	
}
}  
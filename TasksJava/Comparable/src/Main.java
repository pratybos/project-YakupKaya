import java.util.*;

public class Main {

public static void main(String args[]){
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(new Student(101,"Yakup",23));
	al.add(new Student(106,"KAYA",27));
	al.add(new Student(105,"JAVA",21));
	
	Collections.sort(al);
	for(Student st:al){
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}

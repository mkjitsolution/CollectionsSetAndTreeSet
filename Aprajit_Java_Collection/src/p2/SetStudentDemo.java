package p2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStudentDemo {

	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		
		Student s1 = new Student(101,"ramesh",20);
		Student s2 = new Student(102,"ram",200);
		Student s3 = new Student(103,"pawan",70);
		Student s4 = new Student(104,"shyam",80);
		Student s5 = new Student(104,"shyam",80);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		
		Iterator itr = set.iterator(); 
		// iterator as Object type not student type
		System.out.println(" ----------- Way 4 ---------");
		while(itr.hasNext()) // iterator has element or not
		{
			Object obj = itr.next();
			Student stu = (Student)obj;
			System.out.println(stu.getRollNumber()+" -- "+stu.getName()+" -- "+stu.getMarks());
			
		}
		
		
		
	}
}

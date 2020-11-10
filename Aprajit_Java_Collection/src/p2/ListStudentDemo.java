package p2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStudentDemo {

	public static void main(String[] args) {
		
		// Step 2 --- creating students 
		
		Student s1 = new Student(101,"ramesh",20);
		Student s2 = new Student(102,"ram",200);
		Student s3 = new Student(103,"pawan",70);
		Student s4 = new Student(104,"shyam",80);
		
		
		
		List<Student> list = new ArrayList<>();
		
		// step 3: insert Students
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(new ComputerStudent());
	//	list.add(10);
	//	list.add(new Exception("Invalid Student Detail"));
		
		
		// get Information 
		
		// ---->> Way 1
		System.out.println(list);
		
		// --->> way 2 using enhance forLoop
		System.out.println(" ----------- Way 2 ---------");
		for (Object obj : list) {
			if(obj instanceof Student)
			{
				Student stu = (Student)obj;
				System.out.println(stu.getRollNumber()+" -- "+stu.getName()+" -- "+stu.getMarks());
			}
		}//end foreach

		// --->> way 3 using enhance for loop
		System.out.println(" ----------- Way 3 ---------");
		Object arr[] = list.toArray(); // convert collection into array
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Student)
			{
				Student stu = (Student)arr[i];
				System.out.println(stu.getRollNumber()+" -- "+stu.getName()+" -- "+stu.getMarks());
			}
		}
		
		// ----->> Way 4 using Iterator -----
		
		Iterator itr = list.iterator(); 
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










package p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
	public static void main(String[] args) {

		Set<Student> set = new TreeSet();

		Student s1 = new Student(101, "ramesh", 20);
		Student s2 = new Student(102, "ram", 200);
		Student s3 = new Student(103, "pawan", 70);
		Student s4 = new Student(104, "shyam", 80);
		Student s5 = new Student(104, "shyam", 80);

		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		output(set, "Students By Roll Number");
		
		List<Student> studentList = new ArrayList<>(set);
		Collections.sort(studentList,new SortedStudentByMarks());
		output(studentList, "Students By Marks");
		
		
		List<Student> studentListByName = new ArrayList<>(set);
		Collections.sort(studentListByName,new SortStudentsByName());
		output(studentListByName, "Students By Name");
		
		
		
		
		
		
	}//end main
	
	public static void output(Collection<Student> collection,String tagLine)
	{
		System.out.println(" ---------------");
		System.out.println(tagLine);
		for (Student student : collection) {
			System.out.println(student);
		}
	}
	
}//enc class


















package p2;
//             insteads of beans dto(data transfer object)...

import java.io.Serializable;

// its a java bean class
/*
 * 1. implements Serialization
 * 2. implements Comparable 
 * 3. default constructor
 * 4. setter and getter 
 * 5. equals and hashcode
 * 6. toString
 * */
public class Student implements Serializable,Comparable<Student>{
                                 // comparable for default sorting
	      // thats why comes inside bean class and takes single argument
	private int rollNumber;
	private String name;
	private int marks;
	
	public Student() {
		
	}
		
	public Student(int rollNumber, String name, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	@Override
	public int hashCode() {
		System.out.println(" inside hashcode "+this.name);
		 //return super.hashCode(); // default hashcode algo. for unique number 
		// 1000 lines of code
			
		return (rollNumber+name.length()+marks)/3; 
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println(" inside equals "+this.name);
		
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			boolean a = (this.rollNumber == s.rollNumber);
			boolean b = (this.marks == s.marks);
			boolean c = (this.name.equals(s.name));
			
			return a && b && c;
			
		}
		else return false;
	}

	
	

	@Override
	public int compareTo(Student stu) {
		return this.rollNumber - stu.rollNumber;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}//end class






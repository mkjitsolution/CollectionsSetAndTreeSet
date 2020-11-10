package p2;

import java.util.Comparator;

public class SortedStudentByMarks implements Comparator<Student>{

// for customized sorting , thats why saperate class and takes two arguments
	@Override
	public int compare(Student student1, Student student2) {
	
		return student1.getMarks()-student2.getMarks();
	}
	
	
}

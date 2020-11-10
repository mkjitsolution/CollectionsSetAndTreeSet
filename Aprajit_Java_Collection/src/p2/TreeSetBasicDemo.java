package p2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasicDemo {
// sorted collection
	
	public static void main(String[] args) {
	
		Set<Integer> set1 = new TreeSet<>();
		set1.add(15);
		set1.add(4);
		set1.add(185);
		set1.add(24);
		set1.add(5);
		set1.add(47);
		
		System.out.println(set1);
		
		Set<String> set2 = new TreeSet<>();
		set2.add("adff"); //
		set2.add("mhyh");// 44
		set2.add("majj");// 42 // -2
		set2.add("zuh");set2.add("zuh"); // 0
		set2.add("rtt");
		set2.add("dt");
		
		System.out.println(set2);
		
		
	}
}

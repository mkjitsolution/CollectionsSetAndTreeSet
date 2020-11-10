package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		SetDemo obj = new SetDemo();
		obj.hashSetDemo();
		obj.linkedHashSetDemo();
		obj.treeHashSetDemo();
	}

	public void hashSetDemo()
	{
		Set set = new HashSet();
		
		set.add(10);
		set.add(100);
		set.add(1);
		set.add(10);
		set.add(3);
		set.add(4848);
		System.out.println(set);
		
	}
	public void linkedHashSetDemo()
	{
		Set set = new LinkedHashSet();
		
		set.add(10);
		set.add(100);
		set.add(1);
		set.add(10);
		set.add(3);
		set.add(4848);
		System.out.println(set);
	}
	
	public void treeHashSetDemo()
	{
		Set set = new TreeSet();
		
		set.add(10);
		set.add(100);
		set.add(1);
		set.add(10);
		set.add(3);
		set.add(4848);
		System.out.println(set);
	}
}//end class

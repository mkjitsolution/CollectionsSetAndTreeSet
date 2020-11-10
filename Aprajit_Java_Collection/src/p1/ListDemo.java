package p1;

import java.util.ArrayList;
import java.util.List;

class Dog{}  
public class ListDemo {

	public static void main(String[] args) {
		ListDemo obj = new ListDemo();
		obj.arrayListDemo();
		obj.linkedListDemo();
	}
	
	public void arrayListDemo()
	{
		List list = new ArrayList();
		list.add(10); // consider as Integer not int
		list.add(new Dog());
		list.add("My String");
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
	}
	
	public void linkedListDemo()
	{}
}

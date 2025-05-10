package org.jdbcnm;
import java.util.*;
public class Sample {

	public static void main(String[] args)  {
//		Vector v = new Vector();
//		v.add(10);
//		v.add("java");
//		v.add(true);
//		v.add(4565.3456);
//		
//		//Iterate using enumeration
//		Enumeration elements = v.elements();
//		while(elements.hasMoreElements()) {
//			System.out.println(elements.nextElement());
//		}
		
		
		
//		List<Integer> li = new ArrayList();
//		li.add(10);
//		li.add(20);
//		li.add(30);
//		li.add(40);
//		
//		//Bring iterator into List
//		Iterator<Integer> iterator = li.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		List<Integer> li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		//Bring the list Iterator
		ListIterator<Integer> listIterator = li.listIterator();
		//Forward Iteration
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			System.out.println(listIterator.nextIndex());
		}
		
		//Reverse Iteration
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
			System.out.println(listIterator.previousIndex());
		}
		
		
	}

}

package treeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo01 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add(10);
		ts.add(30);
		ts.add(50);
		ts.add(20);
		ts.add(40);
//		ts.add("raj");
		
		System.out.println(ts);
		
		
		//sorted set methods
		
//		ts.comparator();
		
//		Object a=ts.first();
//		System.out.println(a);
		
//		Object a2=ts.last();
//		System.out.println(a2);
		
//		Object a1=ts.headSet(30);
//		System.out.println(a1);
		
//		Object a4=ts.tailSet(20);
//		System.out.println(a4);
		
//		Object a3=ts.subSet(10, 30);
//		System.out.println(a3);
		
		//tree set methods
		
		Object b1=ts.ceiling(31);
		System.out.println(b1);
		
//		Object b4=ts.floor(30);
//		System.out.println(b4);
		
//		Object b2=ts.clone();
//		System.out.println(b2);
		
//		Iterator i=ts.descendingIterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		Object b3=ts.descendingSet();
//		System.out.println(b3);
		
//		Object b5=ts.higher(20);
//		System.out.println(b5);
		
//		Object b6=ts.lower(20);
//		System.out.println(b6);
		
//		Object b7=ts.pollFirst();
//		System.out.println(b7);
//		System.out.println(ts);
		
//		Object b8=ts.pollLast();
//		System.out.println(b8);
//		System.out.println(ts);
		
//		Object b9=ts.subSet(20, true, 40, false);
//		System.out.println(b9);
		
//		Object b10=ts.tailSet(20, false);
//		System.out.println(b10);
		
	}

}

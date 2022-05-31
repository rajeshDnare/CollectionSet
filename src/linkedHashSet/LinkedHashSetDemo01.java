package linkedHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo01 {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(40);
		lhs.add(null);
		lhs.add(null);
		//All methods of collection
		System.out.println(lhs);
		
		lhs.size();
		lhs.isEmpty();
		lhs.clear();
		lhs.add(30);
		lhs.remove(30);
		lhs.toArray();
		
		ArrayList f=new ArrayList<>();
		
		lhs.addAll(f);
		lhs.removeAll(f);
		lhs.contains(f);
		lhs.containsAll(f);
		lhs.retainAll(f);

	}

}

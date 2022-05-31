package hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo01 {

	public static void main(String[] args) {
		HashSet hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		
		
		
		System.out.println(hs);
		
		//All methods of collection
		
//		int a=hs.size();
//		System.out.println(a);
		
//		boolean a1=hs.isEmpty();
//		System.out.println(a1);
		
//		boolean a2=hs.contains(20);
//		System.out.println(a2);
		
//		boolean a3=hs.add(20);
//		System.out.println(a3);
		
//		hs.add(null);
//		System.out.println(hs);
//		
//		hs.add(null);
//		System.out.println(hs); //null insertion is allowed only once
		
//		boolean a4=hs.remove(30);
//		System.out.println(a4);
		
//		hs.clear();
		
//		Object o=hs.clone();
//		System.out.println(hs);
		
//		Object[] obArr=hs.toArray();
//		for (int i = 0; i < obArr.length; i++) {
//			System.out.println(obArr[i]);
//		}
		
		

	}

}

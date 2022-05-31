package hashSet;

import java.util.HashSet;

public class ArrayToSet {
	
	public static void main(String[] args) {
		
		String s="aabccd";
		char[] letters=s.toCharArray();
		HashSet set=new HashSet();
		
		for (char letter : letters) {
			set.add(letter);
		}
		
		for (Object object : set) {
			System.out.print(object+" ");
		}
		 
	}

}

package java1_inverview_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class mainClass {
	
	public static void main (String [] args) {
		
		HashMap<Integer,String> map1 = new HashMap<>();
		ArrayList<Integer> al = new ArrayList<>();
		Set<Integer> hs = new HashSet<>();
		
		
		map1.put(1,"Srikar");
		map1.put(2,"Ram");
		map1.put(3,"sham");
		
//		Iterator it = map1.entrySet().iterator();
//		hs = map1.keySet();
//		for(Integer i : hs) {
//			System.out.println(i);
//		}
//		
//		List<Integer> lt = new ArrayList<>(map1.keySet());
//				for(Integer i : lt) {
//					System.out.println(i);
//				}
		
//		List<Integer> lt = new ArrayList<>();
//		lt=covertSetToList(map1.keySet());
//		        for(Integer i : lt) {
//					System.out.println(i);
//				}
//	
		ArrayList<Integer> ls = new ArrayList<>();
		
		ls.add(23);
		ls.add(23);
		ls.add(24);
		ls.add(25);
		ls.add(26);
		ls.add(26);
		ls.add(26);
		ls.add(27);
		
		for(Integer i : ls) {
			System.out.println(i);
		}
		
		System.out.println("After coverting into set");
		
		HashSet<Integer> hs1 = new HashSet<>(ls);
		
		for(Integer i : hs1) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
}
}


package edu.ocpjp.compare;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q4 {
	public static void main(String[] args) {
		Map <Integer,String> unsortedMap = new HashMap<>();
		unsortedMap.put(1, "d");
		unsortedMap.put(50, "j");
		unsortedMap.put(5, "b");
//		unsortedMap.put(7, "e");
//		unsortedMap.put(10, "z");
		
		Map<Integer,String> treeMap = new TreeMap<Integer,String>(
			new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					System.out.println(" o1="+o1+"; o2="+o2+"; o2.compareTo(o1)="+o2.compareTo(o1));
					return o2.compareTo(o1);
				}
			}
		);
		
		System.out.println("unsortedMap => "+unsortedMap);
		
		System.out.println("putting unsortedMap into sortedTreeMap");
		treeMap.putAll(unsortedMap);
		
		System.out.println("OUTPUT::: \n\n");
		
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getValue()+"");
		}
		
	}
}

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class countOfElementsInSubArray {

	public static void main(String[] args) {
		
		Integer a[]= {1,2,3,1,2,4,2,2,1};
		Arrays.sort(a);
//		{1,1,1,2,2,2,2,3,4}
		/*
		 * {1,1,4},{1,1,3},{1,1,2},{1,1,1}
		 * {1,2,2}
		 * {2,2,4},{2,2,3},{2,2,2}
		 * */

		Map<List<Integer>,Integer> resultMap = new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<a.length-2;i++) {
			int leftPointer = i+1;
			int rightPointer = a.length-1;
			
			while(leftPointer<rightPointer) {
				
				if(a[i] == a[rightPointer] || a[i] == a[leftPointer] || a[leftPointer] == a[rightPointer]) {
					
					if(!resultMap.containsKey(Arrays.asList(a[i],a[leftPointer],a[rightPointer]))) {
						list.add(a[i]);
						list.add(a[leftPointer]);
						list.add(a[rightPointer]);
						int b = Collections.frequency(list, a[i]);
						int c = Collections.frequency(list, a[leftPointer]);
						resultMap.put(Arrays.asList(a[i],a[leftPointer],a[rightPointer]), b>c ? b : c);
					}						
				}
			
				rightPointer--;
				list.clear();
				
			}
		}
		Set s = resultMap.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			System.out.println(m.getKey()+"==>"+m.getValue());
		}
	}

}

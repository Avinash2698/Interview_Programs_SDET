package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class arrayLists {

	public static void main(String[] args) {
		String name[] = {"Abhishek","Ajay","Arun","Abhishek","Ayushi","Ani","Arun"};
		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(name));
        ArrayList<String> s2 = new ArrayList<String>();
        for(int i=0;i<s1.size();i++) {
        	if(Collections.frequency(s1, s1.get(i))==1&& s2.contains(s1.get(i))== false ) {
        		System.out.println(s1.get(i)+" = "+Collections.frequency(s1, s1.get(i)));
        		s2.add(s1.get(i));
        	}
        }
        System.out.println("******************");
        ArrayList<String> s3 = new ArrayList<String>();
        int count;
        for(int i=0;i<name.length;i++) {
        	count = 0;
        	if(s3.contains(name[i])== false) {
        		s3.add(name[i]);
        		count++;
        	}
        	
        	for(int j=i+1;j<name.length;j++) {
        		if(name[i] == name[j]) {
        			count++;
        		}
        	}
        	if(count==1) {
        		System.out.println("Unique Name is: "+name[i]);
        	}
        }
        
        System.out.println("*********************");
        
        String str = "Tomorrow";
        str = str.toLowerCase();
        ArrayList<String> aL1 = new ArrayList<String>(Arrays.asList(str.split("")));
        ArrayList<String> aL2 = new ArrayList<String>();
        for(int i=0;i<aL1.size();i++) {
        	if(Collections.frequency(aL1, aL1.get(i))==1 && aL2.contains(aL1.get(i)) == false) {
        		System.out.print(aL1.get(i)+Collections.frequency(aL1, aL1.get(i)));
        		aL2.add(aL1.get(i));
        	}
        }
        
//        ArrayList<String> a = new ArrayList<String>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.add(12);
//        
//        ArrayList<String> a2 = new ArrayList<String>();
//        a2 = (ArrayList<String>) a.clone();
//        System.out.println(a2);
//        a2.remove(Integer.valueOf(2));
//        System.out.println(a2);
        
//        HashSet<String> hs= new HashSet<String>();
//        hs.add("India");
//        hs.add("USA");
//        hs.add("CA");
//        
//        Iterator<String> it = hs.iterator();
//        while(it.hasNext()) {
//        	a.add(it.next());
//        }
//        System.out.println(a);
	}

}

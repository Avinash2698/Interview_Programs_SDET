package org.example;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abbac";
//        int maxLen = 0;
//        for(int right=0,left=0;right<str.length();right++){
//            int indexOfFirstAppearance = str.indexOf(str.charAt(right),left);
//            if(indexOfFirstAppearance!=right){
//                left = indexOfFirstAppearance+1;
//            }
//            maxLen = Math.max(maxLen,right-left+1);
//        }
//        System.out.println(maxLen);
    
        LinkedHashSet<Character> s = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++) {
        	if(s.add(str.charAt(i))==false) {
        		s.clear();
        		i--;
        	}
        	else {
        		s.add(str.charAt(i));
        	}
        }
        Iterator<Character> it = s.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        System.out.println("Length of SubString is: "+s.size());
    }
}

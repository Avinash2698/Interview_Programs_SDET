package org.example;

import java.util.HashSet;
import java.util.Set;

public class CountConsctv1s {
    public static void main(String[] args) {
        int num[] = {0, 1, 1, 1, 0,1,1,1,1};
//        {0,1,0,1,0,1}
        int count = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        System.out.println("Max Consecutive 1s are :-" + max);
//        Set<Integer> s = new HashSet<Integer>();
//        int count =1;
//        for(int i=0;i<num.length;i++) {
//        	if(s.add(num[i])==false) {
//        		count++;
//        	}
//        	else
//        		s.add(num[i]);
//        	if(count>1) {
//        		
//        	}
//        }
    }
}

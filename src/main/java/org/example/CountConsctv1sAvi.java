package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CountConsctv1sAvi {
    public static void main(String[] args) {
        int num[] = {0, 1, 1, 1, 0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0};
        int count =0;
        int max1 = 1;
        int max2= 1;
        
        for(int i=0;i<num.length-1;i++) {
        	if(num[i]==1) {
        		count++;
        		max1 = count;
        	}
        	else if(num[i] != 1) {
        		count =0;
        	}
        	if(max1>max2) {
        		max2 = max1;
        	}
        }
        System.out.println(max2);
        
    }
}

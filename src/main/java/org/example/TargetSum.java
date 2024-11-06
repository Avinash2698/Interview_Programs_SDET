package org.example;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
//        int[] numbers = {7, 12, 3, 1, 2, -6, 5, -8, 6};
    	int[] numbers = {-1,2,1,-4};
        int target = 1;

        int result = numbers[0]+numbers[1]+numbers[numbers.length-1];
        Arrays.sort(numbers);
        
        
        for(int i=0;i<numbers.length-2;i++) {
        	
        	int leftPointer = i+1;
        	int rightPointer = numbers.length-1;
        	
        	while(leftPointer<rightPointer) {
        		int currentSum = numbers[i]+numbers[leftPointer]+numbers[rightPointer];
        		
        		if(numbers[leftPointer]<target) {
        			leftPointer++;
        		}
        		else {
        			rightPointer--;
        		}
        		
        		if(Math.abs(currentSum-target)<Math.abs(result-target)) {
        			result = currentSum;
        		}
        		
        		
        	}
        	
        }
        System.out.println(result);
        
    }
}

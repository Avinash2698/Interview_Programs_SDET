package org.example;

import java.util.*;

public class Triplets {
    public static void main(String[] args) {
//        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6}; // 0 = a+b+c : 0-a = b+c : -a-b =c
//        List<Integer[]> result = new ArrayList<>();
//        int targetSum = 0;
//        for (int i = 0; i < num.length; i++) {
//            int currentTarget = targetSum - num[i]; // -7
//            Set<Integer> existingSum = new HashSet<>();
//            for (int j = i + 1; j < num.length; j++) {
//                if (existingSum.contains(currentTarget - num[j])) {
//                    result.add(new Integer[]{num[i], num[j], currentTarget - num[j]});
//                } else {
//                    existingSum.add(num[j]);
//                }
//            }
//
//        }
//        for(int i=0;i<result.size();i++){
//            System.out.println(Arrays.toString(result.get(i)));
//        }
        
        int[] num2 = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        
        if(num2.length <3 || num2 == null) {
        	System.out.println(new ArrayList<>());
        }
        
        Arrays.sort(num2);
        
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0;i<num2.length-2;i++) {
        	
        	int leftPointer = i+1;
        	int rightPointer = num2.length-1;
        	
        	while(leftPointer<rightPointer) {
        		int sum = num2[i]+num2[leftPointer]+num2[rightPointer];
        		if(sum == 4) {
        			resultSet.add(Arrays.asList(num2[i],num2[leftPointer],num2[rightPointer]));
        			leftPointer++;
        			rightPointer--;
        		}
        		else if(sum<4) {
        			leftPointer++;
        		}
        		else {
        			rightPointer--;
        		}
        	}
        	
        }
        System.out.println(new ArrayList<>(resultSet));        
    }
}

//class triplets2{
//    public static void main(String[] args) {
//        int[] num = {7, 12, 3, 1, 2, -6, 5, -8, 6};
//        int target = 4;
//        Arrays.sort(num);
//        Set<List<Integer>> list = new HashSet<>();
//        for(int i=0;i<num.length-2;i++){
//            int left = i+1, right = num.length-1;
//            while(left<right){
//                int sum = num[i]+num[left]+num[right];
//                if(sum == 0){
//                    list.add(Arrays.asList(num[i],num[left],num[right]));
//                    left++;
//                    right--;
//                }
//                else if(sum<0){
//                    left++;
//                }else{
//                    right--;
//                }
//            }
//        }
//        System.out.println(list);
//    }
//}

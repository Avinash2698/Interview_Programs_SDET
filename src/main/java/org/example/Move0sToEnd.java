package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Move0sToEnd {
    public static void main(String[] args) {
        Integer[] num = {0, 0, 0, 1, 0, 1, 1, 4, 6, 5};
        int nonZeroIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                int temp = num[i];
                num[i] = num[nonZeroIndex];
                num[nonZeroIndex] = temp;
                nonZeroIndex++;
            }


        }
        System.out.println(Arrays.toString(num));
//        System.out.println("***********************");
        ArrayList<Integer>  convertedNumToList= new ArrayList<Integer>(Arrays.asList(num));
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i=0;i<convertedNumToList.size();i++) {
        	if(convertedNumToList.get(i)==0) {
        		tempList.add(convertedNumToList.get(i));
        	}
        }
        while(convertedNumToList.contains(Integer.valueOf(0))) {
        	convertedNumToList.remove(Integer.valueOf(0));
        }
        for(int i=0;i<tempList.size();i++) {
        	convertedNumToList.add(tempList.get(i));
        }
        System.out.println(convertedNumToList);
    }
}

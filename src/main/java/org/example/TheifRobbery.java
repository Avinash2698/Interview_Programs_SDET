package org.example;

public class TheifRobbery {
    public static void main(String[] args) {
        int[] money = {2,7,9,3,1};
        int previous = money[0];
        int previousToPrevious = 0;
        for(int i=1;i<money.length;i++){
            int temp = previous;
            previous = Math.max(previous,previousToPrevious+money[i]);
            previousToPrevious = temp;
        }
        System.out.println(previous);
    }
}
/*
 * 1st- previous = 2,previousToPrevious=0,temp =2,previous=max(2,0+7)=7,previousToPrevious=2
 * 2nd- previous = 7,previousToPrevious=2,temp =7,previous=max(7,2+9)=11,previousToPrevious=7
 * 3rd- previous = 11,previousToPrevious=7,temp =11,previous=max(11,7+3)=11,previousToPrevious=11
 * 4th- previous = 11,previousToPrevious=11,temp =11,previous=max(11,11+1)=12,previousToPrevious=11
 * */

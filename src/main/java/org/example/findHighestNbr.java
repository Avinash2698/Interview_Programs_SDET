package org.example;

public class findHighestNbr {
    public static void main(String[] args) {
        int nbrArr[] = {1,2,4,3,5,2,6,5,9,8};
//        int largest = nbrArr[0];
//        for(int i=1;i<nbrArr.length;i++){
//            if(i==nbrArr.length-1 && nbrArr[i]>nbrArr[0]){
//                System.out.println(nbrArr[i]);
//            }
//            else if(nbrArr[i]>largest && nbrArr[i+1]<nbrArr[i]){
//                System.out.println(nbrArr[i]);
//                largest = nbrArr[i];
//            }else{
//                largest = nbrArr[i];
//            }
//        }
        int n = nbrArr.length%3;
        for(int i=0;i<nbrArr.length-n;i=i+3) {
        	System.out.println(Math.max(nbrArr[i], Math.max(nbrArr[i+1], nbrArr[i+2])));
        }
        if(n==2) {
        	System.out.println(Math.max(nbrArr[nbrArr.length-n], nbrArr[nbrArr.length-1]));
    	}
    	else if(n==1) {
    		System.out.println(nbrArr[nbrArr.length-n]);
    	}
        
    }
}

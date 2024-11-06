package org.example;

public class stringWordsReverse {

	public static void main(String[] args) {
		
		String str = "This is Demo String !!!";
		String[] a = str.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		System.out.println("******************");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}

	}

}

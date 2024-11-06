package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram2 {

	public static void main(String[] args) {
		
		String s1 = "aacc  ";
		String s2 = "ccac";
		
		s1=s1.toLowerCase().replace(" ","");
		s2=s2.toLowerCase().replace(" ", "");
		
		
		System.out.println(Anagram(s1,s2));
	}
	
	public static boolean Anagram(String s1, String s2) {
		ArrayList<String> AL1 = new ArrayList<String>(Arrays.asList(s1.split("")));
		ArrayList<String> AL2 = new ArrayList<String>(Arrays.asList(s2.split("")));
		
		if(s1.length()!=s2.length())
			return false;
		
		for(int i=0;i<AL1.size();i++) {
			if(!(Collections.frequency(AL1, AL1.get(i)) == Collections.frequency(AL2, AL1.get(i)))) {
				return false;
			}
		}
		return true;
	}

}

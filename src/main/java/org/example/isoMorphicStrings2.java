package org.example;

import java.util.HashMap;

public class isoMorphicStrings2 {

	public static void main(String[] args) {
		String s1= "bara";
		String s2 = "foot";
		System.out.println(isoMorphicStrings(s1,s2));
	}
	
	public static boolean isoMorphicStrings(String str1,String str2) {
		
		if(str1.length()!=str2.length())
			return false;
		
		HashMap<Character,Character> hm = new HashMap<Character,Character>();
		for(int i=0;i<str1.length();i++) {
			if(!hm.containsKey(str1.charAt(i))) {
				hm.put(str1.charAt(i), str2.charAt(i));
			}	
			else if(hm.get(str1.charAt(i)) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}

package org.example;

public class replaceWithStar {

	public static void main(String[] args) {
		String s = "Tomorrow";
		char c = 'o';
		int count = 0;
		String s2 = "";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == c) {
				count++;
				for(int j=0;j<count;j++) {
					s2 = s2+'*';
				}
				s = s.substring(0,i)+s2+s.substring(i+1);
				s2 = "";
			}
		}
		System.out.println(s);
	}

}

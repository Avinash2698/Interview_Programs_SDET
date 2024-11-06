package org.example;
import java.util.Random;

public class staticVariable {
	
	static int number;

	public static void main(String[] args) {
		staticVariable.number = new Random().nextInt();
		System.out.println(staticVariable.number);
		staticVariable.number = new Random().nextInt();
		System.out.println(staticVariable.number);
		staticVariable.number = new Random().nextInt();
		System.out.println(staticVariable.number);
	}

}

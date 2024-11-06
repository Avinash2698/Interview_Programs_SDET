package org.example;

import java.time.LocalDateTime;

public class dateClass {

	public static void main(String[] args) {
		LocalDateTime myDateObj = LocalDateTime.now();
		String date = myDateObj.toString().split("T")[0];
		Integer year = Integer.parseInt(date.split("-")[0]);
		Integer month = Integer.parseInt(date.split("-")[1]);
		System.out.println(year+" "+month);
	}
}

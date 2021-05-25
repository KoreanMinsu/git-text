package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		
		int hour = sc.nextInt();
		int nWage = 10000*hour;
		int overtime = (int)(1.5*10000 *(hour - 8));
		int wage = 80000 + overtime;

				
		if(hour <= 8) {
			System.out.println("임금은 "+ nWage +  "원 입니다." );
		} else {
			System.out.println("임금은 "+ wage + "원 입니다.");
			
		sc.close();
		}
	}
}

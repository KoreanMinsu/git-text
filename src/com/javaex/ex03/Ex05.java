package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ��ð�: ");
		
		int hour = sc.nextInt();
		int nWage = 10000*hour;
		int overtime = (int)(1.5*10000 *(hour - 8));
		int wage = 80000 + overtime;

				
		if(hour <= 8) {
			System.out.println("�ӱ��� "+ nWage +  "�� �Դϴ�." );
		} else {
			System.out.println("�ӱ��� "+ wage + "�� �Դϴ�.");
			
		sc.close();
		}
	}
}

package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ٹ��ð�: ");
		int hour = sc.nextInt();
		
		if(hour <= 8) {
			int wage = 10000*hour;
			System.out.println("�ӱ��� "+ wage +  "�� �Դϴ�." );
		} else {
			int wage = 80000 + 12000*(hour-8);
			System.out.println("�ӱ��� "+ wage + "�� �Դϴ�.");
			
		sc.close();
		}
	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("500�� ����: ");
		int fHundred = sc.nextInt();
		System.out.print("100�� ����: ");
		int hundred = sc.nextInt();
		System.out.print("50�� ����: ");
		int fTen = sc.nextInt();
		System.out.print("10�� ����: ");
		int ten = sc.nextInt();
		
		int total = (500*fHundred) + (100*hundred) + (50*fTen) + (10*ten);
		
		System.out.println("������ ������ " + total + "�� �Դϴ�.");
		

		sc.close();
		
	}
}

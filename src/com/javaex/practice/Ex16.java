package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {

		final double vat = 0.1;

		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ����: ");
		double price = sc.nextDouble();
		System.out.print("������: ");
		double money = sc.nextDouble();
		
		System.out.println("===================");
		System.out.println("������: " + money);
		System.out.println("��ǰ����: " + price);
		System.out.println("�ΰ���: " + vat*price);
		System.out.println("�ܾ�: " + (money-price));


		sc.close();
		
	}
}

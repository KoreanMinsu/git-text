package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {

		final double pi = 3.14;

		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		double radius = sc.nextDouble();
		double v = 4.0/3.0*pi*radius*radius*radius;
		System.out.println("���� ���Ǵ�: " +  v + " �Դϴ�.");

		sc.close();
		
	}
}

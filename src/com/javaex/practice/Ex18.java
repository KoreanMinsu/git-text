package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ��: ");
		double f = sc.nextDouble();
		double c = (5.0/9.0)*(f-32.0);
		System.out.println("ȭ�� " +  f + " �� �����µ��� " +  c + " �Դϴ�.");

		sc.close();
	}
}

package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		final double mile = 1.609;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		double km = sc.nextDouble();
		System.out.println(km + "������ " + mile*km + "ų�ι��� �Դϴ�.");

		sc.close();

	}
}

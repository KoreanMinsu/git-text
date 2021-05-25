package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {

		final double mile = 1.609;

		Scanner sc = new Scanner(System.in);
		System.out.print("마일을 입력하세요: ");
		double km = sc.nextDouble();
		System.out.println(km + "마일은 " + mile*km + "킬로미터 입니다.");

		sc.close();

	}
}

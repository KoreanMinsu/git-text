package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		int radius = sc.nextInt();
		System.out.println("���� ���̴� " + pi*(radius*radius) + "�Դϴ�." );
		sc.close();

	}
}

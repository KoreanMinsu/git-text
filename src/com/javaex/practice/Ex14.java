package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���θ� �Է��ϼ���: ");
		double width = sc.nextDouble();
		System.out.print("���θ� �Է��ϼ���: ");
		double height = sc.nextDouble();
		System.out.println("�簢���� ���̴� " + width*height);
		System.out.println("�簢���� �ѷ��� " + 2*(width+height));

		sc.close();

	}
}

package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
			final double cr = 1230.95;
		
			Scanner sc = new Scanner(System.in);
			System.out.print("ȯ���� ��ȭ�� �Է��ϼ���: ");
			double krw = sc.nextDouble();
			System.out.println("������ �޷��� " + krw/cr );
			
			sc.close();

	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int salary = sc.nextInt();
		int dMaxSalarySaving =  salary*12*10;
		System.out.println("10�⵿�� �ִ� ������� "+ dMaxSalarySaving+"�� �Դϴ�.");
	
		sc.close();
		
	}

}

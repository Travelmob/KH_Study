package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*
	 * ��� ������ => ���� ������, �켱������ �Ϲ� ���� ����� ����
	 */
	
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ��ⷯ(Modular) => ������������ �������� ����

	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		
		// ������� : "num1 + num2 : 103"
		// (num1 + num2) ��ȣ�� ������� 13�̶�� ������� ����!
		// ���� �ʰ� �����ϸ� String(���ڿ�)�� �ν��ϱ� ������
		// "10" + "3" ��������� "103"�� ����!!!
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		// ������ ��� ��ȣ�� ����������
		// ���ڿ��� num1�� �ϳ��� ���� �� ������ ���� ������ ���� �߻�!
		
		System.out.println("num1 X num2 : " + num1 * num2);
		System.out.println("num1 / num2 : " + num1 / num2);
		System.out.println("num1 % num2 : " + num1 % num2);
		
		// *, /, % �켱������ +, -���� ���� ������ ���� �ʾƵ� ���� ����
		// ��, �������� ���� ��ȣ�� ����ϴ� ���� ����
		
		// * Ư�����̽�
		//System.out.println();
		// ������ 0���� ������ ����!
		// ArithmetricExeption : / zero
		
		

	}
	
	// ��̳� ���� �����ֱ� ���α׷�
	
	// �޼ҵ�� : presentToChild()
	// �Է¹��� �� : 1. ����� �ο� ��
	//          2. ���� ����
	
	// 1�δ� ������ �ִ� ������ ���� : ���� ���� / ��� ��
	// ����  ������ �� : �������� % ��� �� 
	
	// ��� ����
	// ��� 1�δ� ���� �� �ִ� ������ ����: X��
	// ���� ������ ���� : X��
	
	public void present() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� �ο� ���� �Է��� �ּ��� : ");
		int child = sc.nextInt();
		
		System.out.println("�� ���� ������ �Է��� �ּ��� : ");
		int present = sc.nextInt();
		
		System.out.printf("��� 1�δ� ���� �� �ִ� ������ ���� : %d��\n", present / child);
		System.out.printf("���� ������ ���� : %d��", present % child);
		
		sc.close();
	}
}

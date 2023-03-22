package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * �� ������ : �� ���� ������ �����ϴ� ������
	 * 
	 * [ ǥ����]
	 * 
	 * ���� �������� ����          => ������� ����
	 * 
	 * ����
	 * 
	 * 1. AND������ : ���� && ����
	 * ���װ� ������ ���� ��� true���߸� ���� ����� true
	 * 
	 * 2. OR������ : ���� || ����
	 * ���װ� ������ �� �� �ϳ��� true�̸� ���� ����� true
	 *
	 * 
	 */
	
	//AND
	public void method1() {
		
		//����ڰ� �Է��� ���� ���� ��� �̸鼭(�̰�) ¦������ Ȯ��!
		//                num > 0
		//                            num % 2 == 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� ! > ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num % 2 == 0);
		//               ����ڰ� �Է��� ������ 0���� ũ�� 2�� ������ �� 0�ΰ���?
		// && �ǹ� : ~~�̸鼭, ~~�̰�, �׸��� 
		
		System.out.println("����ڰ� �Է��� ������ ����̸鼭 ¦���ΰ���? : " + result);
		
		sc.close();
	}
	
	public void method2() {
		//����ڿ��� �������� �Է¹޾� 1�̻� 100�������� Ȯ���غ���!
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� > ");
		int num2 = sc2.nextInt();
		
		// 1<= num <= 100
		
		boolean result2 = (1 <= num2) && (num2 <= 100);
		//			num�� 1���� ũ�ų� ���� "�׸���" num�� 100���� �۰ų� ����?
		
		System.out.println("����ڰ� �Է��� ������ 1 �̻� 100 �����ΰ���? : " + result2);
		
		sc2.close();
	}
	
	//OR
	
	public void method3() {
		
		//����ڰ� �Է��� ���� 'A' �Ǵ� 'a'���� Ȯ��!
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("�� ���ڸ� �Է����ּ��� > ");
		char ch;
		ch = sc3.next().charAt(0);
		
		// index : ���� **0���� ����
		
		// == �񱳿����ڴ� �ǿ����� == ����
		// ���� ������ ��� �񱳿����� �����Ѱ�? �����ϴ�
		// ��? int������ �ڵ�����ȯ�� �Ǳ� ������(int)
		
		boolean result3 = ((int)ch == 'A') || ((int)ch == 'a');
		// || : �̰ų�, �Ǵ�
		
		System.out.println("�Է��� ���ڰ� A �Ǵ� a�Դϱ�?" + result3);
		
		sc3.close();
	}
	
	/*
	 * 
	 * 
	 * && : �� ���� ������ ��� true�� �� true
	 * 
	 * true && true : true
	 * true && false : false
	 * false && true : false
	 * false && false : false
	 * 
	 * || : �� ���� ���� �� �ϳ��� true�̸� true
	 * 
	 * true || true : true
	 * true || false : true
	 * false || true : true
	 * false || false : false
	 */
	
	public void method4() {
		
		int num = 10; 
		
		boolean result = false && (num>0);
		
		// Deadcode : ���� �񱳿��� ������ ������� ����
		// ������ ���� �� �ƴ����� ���� ������� false���ٵ� �� �ڵ�� �� ����??
	}
}

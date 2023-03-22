package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
		
	/* 
	 * ���׿����� : �� �����ڰ� 3�� => �� 3���� ������ 1���� �̷����(���ǽ� �������� ����)
	 * 
	 * ���ǽ� : ������� ���� ������ ó���ϴ� ���
	 *        ������� ���� ��� ù��° ���� ó���ϰ�,
	 *        ������� ������ ��� �ι�° ���� ó���ϴ� ���
	 *        
	 * [ ǥ����]       
	 *
	 * ���ǽ� ? ������ true�� ��� ����� : ������ false�� ��� �����
	 */
	public void method1() {
		// ����ڰ� �Է��� ���� ������� �ƴ��� �Ǻ� �� �׿� �´� ��� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ּ��� > ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "���" : (num < 0) ? "����" : "0��";
					// ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� �����
				
		System.out.println(num + "�� " + result + "��!!");
		// 10�� �����!!
		// -7�� ������!!
		
		sc.close();
	}
	
	public void method2() {
		// ¦�� / Ȧ�� �Ǻ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ��� > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦��" : "Ȧ��";
				
		//10 ��(��) ¦��
		// 7 ��(��) Ȧ��
		
		System.out.println(num + "��(��) " + result);
	}
	
	public void method3() {
		//����ڿ��� �����ڸ� �ϳ� �Է¹޾Ƽ� �빮������ �ƴ��� �Ǻ�!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ڸ� �ϳ� �Է����ּ��� > ");
		char ch = sc.next().charAt(0);
		
		String result = ('A' <= ch && ch <= 'Z' ? "��" : "�� �ƴ�");
		System.out.println("�Է��Ͻ� ���ڴ� �빮��" + result + "�ϴ�.");
	}
	
	public void method4() {
		
		// ���� 3���� �Է¹޾Ƽ� �� �Ȱ����� �Ȱ���!!! �ϳ��� �ٸ��ٸ� �ٸ���!!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է����ּ��� : ");
		char ch1 = sc.next().charAt(0);
		
		System.out.println("�� ��° ���ڸ� �Է����ּ��� : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("�� ��° ���ڸ� �Է����ּ��� : ");
		char ch3 = sc.next().charAt(0);
		
		String result = (ch1 != ch2) ? "�ٸ�����" : (ch2 != ch3) ? "�ٸ�����" : "�Ȱ�����";
		String result2 = (ch1 != ch2 || ch2 != ch3) ? "�ٸ�����" : "�Ȱ�����";
		String result3 = (ch1 == ch2 && ch2 == ch3) ? "�Ȱ�����" : "�ٸ�����";
		
		System.out.println("�ڳװ� �� ���� 3���� ���� \n" + result +"\n" + result2 + "\n" + result3);
		
		sc.close();
	}
}

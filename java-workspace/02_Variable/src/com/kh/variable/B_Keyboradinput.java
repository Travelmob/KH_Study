package com.kh.variable;

import java.util.Scanner;

public class B_Keyboradinput {
	
	/*
	 * Ű���带 �̿��ؼ� ����ڿ��� �Է°��� �޾ƺ���!
	 * System.in
	 * �ڹٿ��� �̹� �����ϰ� �ִ� Scanner��� Ŭ������ ����� ��!
	 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ���� ȣ���ؼ� ���
	 * 
	 */
	public void inputTest() {
		
		Scanner sc = new Scanner(System.in);
		// System.in : �Է¹��� ������ �޾Ƶ��̰ڴ�.(����Ʈ������)
		
		// ������� ���������� �Է¹޾� ����غ���!
		
		// �Է¹ް��� �ϴ� ������ ���� �����ؼ� �Է��� ����
		System.out.println("�̸��� ��� �Ǽ���? : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ�
		// nextLine(), next()
		// nextLine() : ����ڰ� �Է��� �� �� ����� �����ϰ� �� ������ �� �о�� ���๮�ڸ� ������ ������
		String name = sc.next();
		
		System.out.println(name + "�� �ȳ��ϼ���!");
		
		// nextInt()
		// nextDouble()
		System.out.println("���̰� ��� �Ǽ���? :");
		int age = sc.nextInt();
		System.out.println(age + "�� �̽ó׿�!");
		
		System.out.println("Ű�� ��� �Ǽ���? :");
		double height = sc.nextDouble();
		System.out.println(height + "cm�̽ó׿�!");
		
		
		// nextLine() : ���ۿ��� ���๮�� ���������� ��� ���� ������ �� "���๮��"�� ����ִ� ����
		sc.nextLine();
		System.out.println("�ּҰ� ��� �Ǽ���?");
		String address = sc.nextLine();
		// next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���� ���������� �Է� ����
		System.out.println(address + "�� ��ô±���.");
		
	}

}

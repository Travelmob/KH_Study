package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break : break���� ������ ���� "���� ����� �ݺ���"�� ����������.
	 *         �ش� break���� �����ִ� �ݺ��� "�Ѱ�"�� ��������!!!!!!!
	 *         
	 * * ���ǻ��� : switch�� �ȿ� break;�� �ٸ� ����
	 * 			 switch�� ���ο� �ִ� break �ش� switch���� ���������� �뵵�� ��!!
	 * 
	 */
	
	public void method1() {
		
		// �� �� �ݺ��ؼ� ���Ӱ� ������ (1~100)�� �����ؼ� ��� => �����ϰ�
		
		// 1. while(true)
		// 2. for(;;)
		
		// �ݺ��� �ϴٰ� ������ ������ ������ Ȧ���� ��� �ݺ��� �ߴܽ�Ű�� ����
		
		for(;;) {
			int num = (int)(Math.random()*100) + 1;
			if(num % 2 == 1) {
				System.out.println("�ݺ� ��!");
				break;
			}
			System.out.println(num);
		}
	}
	
	public void method2() {
		
		// �� �� ����ڿ��� ���ڿ��� �Է� ���� ��
		// �ش� ���ڿ��� ���̸� ����غ��� ~
		// ��, ����ڰ� "exit"�� �Է��� ��� �ݺ����� ���������� ���� ��
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڿ��� �Է����ּ���");
			String str = sc.nextLine();
			
			//����ڰ� �Է��� ���ڿ��� "exit"�� �����ϴٸ�
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
		}
	}
	// �� �� ����ڷκ��� ���ڸ� �Է¹ް�
	// ���࿡ �ش� ���ڰ� �������"���α׷��� �����մϴ�. "��� ������ ����ϰ� ����
	
	public void make() {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է����ּ���(������ ����) : ");
			int num = sc.nextInt();
		
			if(num < 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.println(num);
		}
	}
	/*
	 * ����ڷκ��� �� ���� ���� �Է� �޾Ƽ�
	 * 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����غ�����!
	 * 
	 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ��մϴ�.
	 * 
	 * ���࿡ 1�̸��� ���ڰ� �Էµƴٸ�
	 * "1�̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����ڿ��� ���� �Է¹�������!
	 * 
	 * ex)
	 * 
	 * 
	 */
	
	public void make2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է����ּ���(���� : ���, Ż��: 0) : ");
			int num = sc.nextInt();
		
			if(num < 0) {
				System.out.println("1�̻��� ���ڸ� �Է����ּ���");
			}
			else if(num == 0) {
				System.out.println("Ż��!");
				break;
			}
			else {
				for(int i = num; num > 0; num--) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
	}
		
	public void make2_teacher() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag;
		
		do {
			System.out.println("1 �̻��� ���� >");
			num = sc.nextInt();
			flag = num < 1; // �ⱳ : boolean�� �����ؼ� ����� �� ����
			if(flag) System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		} while(flag);
		
		for(; num > 0; num--) {	// �ⱳ : i ���� for�� ����ϴ� ��
			System.out.print(num + " ");
		}
	}
	
	/*
	 * 
	 * ����ڷκ��� ���� ���ڿ� ������ �Է¹޾Ƽ�
	 * ������ ������ ���ڰ� Ŀ���� ���α׷��� �����ô�.
	 * ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
	 * * '����'�� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���մϴ�.
	 * 
	 * ex) 1, 4, 7, 10, 13, 16...
	 * 		3  3  3  3  3  3 -> ���⼭ ������ 3
	 * 
	 */
	
	public void make3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���ڸ� �Է����ּ��� : ");
		int num = sc.nextInt();
		System.out.println("������ �Է����ּ��� : ");
		int gongcha = sc.nextInt();
			
		for(int i = 10; i > 0; i--) {
			System.out.print(num + " ");
			num += gongcha;
		}
	}
}

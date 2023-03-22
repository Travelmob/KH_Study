package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * �ܵ� if��
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�){
	 * 		���ǽ��� true�� ��� ����� �ڵ�
	 * }
	 * 
	 * 
	 * => ���ǽ��� ����� true�� ��� : {}(�߰�ȣ) ���� �ڵ���� �����
	 * => ���ǽ��� ����� false�� ��� : {}(�߰�ȣ) ���� �ڵ���� �ǳʶ�
	 * 
	 */
	
	public void lunchMenu() {
		
		// �����
		// �����
		
		// ���� / ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ ??(����, ���) > ");
		
		String weather = sc.nextLine();
		
		String lunch = (weather.equals("����")) ? "�����" : "�����";
		                //���ڿ� �� �񱳴� .equals()		
		System.out.println("������ ������ " + lunch + "�Դϴ�.");
	
	}
	
	// ���׿����� �� �غô� ��
	public void method1() {
		// ������ �Է¹ް� ��� / 0 / ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� > ");
		int num = sc.nextInt();
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� ũ�ٸ�
		if(num > 0) {
			System.out.println(num + "��(��) �����!!");
		}
		
		// ���࿡ ����ڰ� �Է��� ���� 0�̶��
		if(num == 0) { System.out.println("0�̴�!!");}
		
		// ���࿡ ����ڰ� �Է��� ���� 0���� �۴ٸ�
		if(num < 0) System.out.println("�����Դϴ�.");
			
	}
	
	public void method2() {
		
		// if���� �̿��ؼ� Ȧ�� / ¦�� �Ǻ�
		// ����� ��쿡�� ���ǹ��� ����!!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �Է����ּ��� > ");
		int num = sc.nextInt();
		
		// Ȧ�� + ���
		// ¦�� + ���
		
		String result = "";
		
		if(num > 0) {
			result = ((num % 2) == 0) ? "¦��" : "Ȧ��";
			System.out.println("�Է��Ͻ� ���ڴ� " + result + "�Դϴ�");
		}
		
		// ���࿡ ����ڰ� �Է��� ���� ����̰�(�̸鼭) ����ڰ� �Է��� ���� ¦����
		// if          ((num  > 0)   &&        (num   % 2 == 0))
		if((num > 0) && (num % 2 == 0)) System.out.println("�Է��Ͻ� ���ڴ� ����� ¦���Դϴ�");
		// ���࿡ ����ڰ� �Է��� ���� ����̰�(�̸鼭) ����ڰ� �Է��� ���� Ȧ����
		// if          ((num  > 0)   &&        (num   % 2 != 0))
		if((num > 0) && (num % 2 != 0)) System.out.println("�Է��Ͻ� ���ڴ� ����� Ȧ���Դϴ�");
		
		// ��ø if��
		// ����� ����
		if(num > 0) {
			if(num % 2 == 0) System.out.println("¦��");
			if(num % 2 == 1) System.out.println("Ȧ��");
		}
	}	
	public void method3() {
		
		// �ֹι�ȣ üũ
		// �ֹι�ȣ�� �Է¹޾Ƽ� ���� üũ
		//                7�ڸ� 2000�⵵ ���� 1,2,3,4
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ ���ڸ��� �Է����ּ��� : ");
		String str = sc.next();
		System.out.print("�ֹε�Ϲ�ȣ ���ڸ��� �Է����ּ��� : ");
		String str2 = sc.next();
		
		String personId = str + "-" + str2;
		
		//System.out.println(personId);
		
		// "������ �ִ� (����)���ڵ��� ����"
		// "a b c d e f g"
		//  0 1 2 3 4 5 6
		// ������ index��� �θ� ** index�� 0������ ����
		
		// 1 1 1 1 1 1 - 2 2 2 2 2 2 2 
		// 0 1 2 3 4 5 6 7 8 9
		
		// �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� '����'�� ����
		// charAt(7) => �ֹι�ȣ ���ڿ� �� 8��°�� �ִ� 7�� �ε����� �����ϰڴ�.
		
		char gender = personId.charAt(7);
		
		System.out.println(gender);
		
		// 1 / 3�̸� �����Դϴ� ���
		// 2 / 4�̸� �����Դϴ� ���
		// �� �� �ƴϸ� ??????? ���
		
		if (gender == '1' || gender == '3') System.out.print("�����Դϴ�");
		if (gender == '2' || gender == '4') System.out.print("�����Դϴ�");
		
		// ���࿡ ����ڰ� �Է��� �ֹε�Ϲ�ȣ���� 8��° ���ڰ� �� �� �ƴϸ�
		// if(
		if (gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.print("????????");
		}

	}

}

package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() { // �޼ҵ� 0 ���� ����
		
		// ctrl + shift + o		: import ����Ű
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ���ó���? :");
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1 : System.out.println("�����Դϴ�. ���� �����ϴ�.");
		break;
		case 2 : System.out.println("�����Դϴ�. ���� �����ϴ�.");
		break;
		case 3:  System.out.println("�����Դϴ�. ���� �����ϴ�.");
		break;
		
		}
		
		/*
		 * switch��
		 * 
		 * [ ǥ���� ]
		 * 
		 * switch(�Ʒ� ����� ����� ����񱳸� �� �����){
		 * 		case ����, ����, ���ڿ� : ������ �ڵ�1;
		 * }
		 * 
		 * 			// ����񱳴��
		 * switch(����, ����, ���ڿ�){
		 * 		case ��1 : ������ �ڵ�1; // ����񱳴�� == ��1   true�� ��� ������ �ڵ� 1�� ����
		 *		break;				// switch������ ����������.
		 *		case ��2 : �������ڵ�2; // ����񱳴�� == ��2   true�� ��� ������ �ڵ� 2�� ����
		 *		break;
		 *		case ��n : �������ڵ�n; // ����񱳴�� == ��n 
		 *		break;
		 *		default : �������ڵ�; // == else 
		 *	}
		 *
		 */
		
	}
	
	public void method1() {
		//����ڿ��� ���� �Է¹޾Ƽ� Ȧ��/¦�� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ּ���? > ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : ¦��, 1 : Ȧ��
		
		switch(oddEven) {
		case 0: System.out.println("¦����??");
		break;
		case 1: System.out.println("Ȧ����??");  // Switch���� ���������� break ���� ����
		}
	}
	
	public void method2() {
		
		// 1. ����ڷκ��� �ֹι�ȣ �Է¹ޱ� (String personId => xxxxxx-0xxxxxx)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է����ּ��� (- ����)");
		String personId = sc.next();
		
		// 2. �Է¹��� �ֹι�ȣ�κ��� ������ �ش��ϴ� ���ڸ� ����
		
		char gender = personId.charAt(7);
		
		// 3. ����ġ���� �̿��ؼ� ���ǹ� �ۼ�
		
		String gender2;
		
		switch(gender) {
		case '1' :
		case '3' : gender2 = "����";
		break;
		case '2' :
		case '4' : gender2 = "����";
		break;
		default : gender2 = "�ܰ���";
		}
		System.out.println(gender2 + "�Դϴ�.");
	}
	
	// switch
	// �ұ���, ���, ���κ�, �����, ���ö�, ����
	public void foodCourt() { // �Թ����� 1��
		
		// ����ڿ��� ������ ������ �̸��� �Է¹޾�
		// �� ���ĸ����� ������ ������� ��
		
		// �ұ���,	���,		���κ�,	�����,	���ö�,	����
		// 12000,	5000	8000	10000	6000	12000
		
		// ���� ~ �츮���� ���� ~ ���� �� ~
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է����ּ���(�ұ���, ���, ���κ�, �����, ���ö�, ����) : ");
		String food = sc.nextLine();
		int cost = 0;
		
		switch(food) {
		case "�ұ���" :
		case "����" : cost = 12000; break;
		case "�����" : cost = 10000; break;
		case "���κ�" : cost = 8000; break;
		case "���ö�" : cost = 6000; break;
		case "���" : cost = 5000; break;
		default : System.out.printf("�츰 %s ���� ������ �� �Ⱦ�", food);
		return; // break�� �ݺ��� return�� �޼��带 ��������
				// ���� ����ǰ� �ִ� �޼ҵ念���� �ƿ� ����������.
				// �޼ҵ� ȣ�� �κ����� ���ư���~
		}
		if(cost != 0) {
			System.out.printf("%s�� ������ %d�� �Դϴ�", food, cost);
		}
		
		}
	
	public void login() {
		
		// �α��� ���!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String userId= sc.nextLine();
		
		System.out.println("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		String nickname = "�ڹٰ�����";
		
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("�α��� ����~!" + nickname + "�� ȯ���մϴ� ^.^");
		// ����ڰ� �Է��� ���ڿ��� ȸ�����Խ� �Է��� ���ڿ��� ��ġ���� �ʴ´ٸ�
		} else if(!userId.equals(id)) {
			System.out.println("���̵� �������� �ʽ��ϴ�!");
		} else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		// �⺻�ڷ��� : boolean, byte, int ,short, long, float, double, char
		// => �⺻�ڷ��� ���� ���״� �����(==, !=)�� �� ��!!!
		
		// �����ڷ��� : String�� ���
		// => �����(==,!=)
		// ����? �����ڷ�����  ��� ������ ������ ���� ���� '�ּҰ�'�̱� ����
		// ���ڿ��� ���� �� : equals()�� ����Ѵ�. => true, false
		// [ǥ����] ���ڿ�.equals("���ҹ��ڿ�");
		
	}
}

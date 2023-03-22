package com.kh.variable;

public class A_Variable {
	// ������ �ʿ伺
	// 9900��
	
	// �ֱް���� ���ִ� �޼ҵ�

	public void calPay() {
		System.out.println("--- ������ ����ϱ� �� ---");
		
		System.out.println("�ñ� : 9980��");
		System.out.println("�ٹ� �ð� : 8�ð�");
		System.out.println("�ٹ� �ϼ� : 5��");
		
		// �ֱ� = �ñ� X �ٹ��ð� X �ٹ��ϼ�
		// �������  [XXX: 00000��]
		// �ڹٿ��� +��ȣ�� ���� ���� ���� �� ���
		// �ڹٿ��� *��ȣ�� ���� ���� ���� �� ���
		
		System.out.println("�̽�ö : " + (9980 * 8 * 5) + "��");
		System.out.println("���¿� : " + (9980 * 8 * 5) + "��");
		System.out.println("���·� : " + (9980 * 8 * 5) + "��");
		System.out.println("������ : " + (9980 * 8 * 5) + "��");
		
		
		System.out.println("--- ���� ��� �� ---");
		
		// ������ �ñ�, �ٹ��ð�, �ٹ��ϼ���� ���� ���� ����
		// ��, ������ ����� �� �ȿ� ���� ��´�.
		int pay = 10080;
		int time = 8;
		int day = 6;
		
		System.out.println("�ñ� : " + pay + "��");
		System.out.println("�ٹ� �ð� : " + time + "�ð�");
		System.out.println("�ٹ� �ϼ� : " + day + "��");
		
		System.out.println("�̽�ö : " + (pay * time * day) + "��");
		System.out.println("���¿� : " + (pay * time * day) + "��");
		System.out.println("���·� : " + (pay * time * day) + "��");
		System.out.println("������ : " + (pay * time * day) + "��");
		
		/* 
		 * ������ ����ϴ� ����
		 * 
		 * 1. �� �ѹ��� ���� ��������ν� �ʿ��� ������ ������ ���� => ���뼺�� ������
		 * 2. ������ ���� �ǹ̸� �ο��ϱ� ���� ��� => �������� ������
		 * 
		 * �������� ���뼺�� �������� ���������� ��������
		 * 
		 */
		
	} // calPay() ��
	
	// ������ ����
	public void declareVariable() { // declareVariable ���� ����
		
		/*
		 * ���� ���� ���
		 * 			int pay;
		 * 
		 * ����Ÿ��(�ڷ���) �����̸�;
		 * ���� Ÿ���� ������ ������ ���� �Ѳ����� ������ �� ���� ex) int pay, day, time;
		 * ������ �����ϰ� �� �ڿ� ó�� ���� �����ϴ� ���� �ʱ�ȭ(initialization)��� ��
		 * �ʱ�ȭ�� �����Ͽ� ������ ���� �ʱⰪ�̶�� ��
		 * 
		 */
		
		// System.out.println(pay); ������ {} �߰�ȣ �ȿ��� ����ǰ� ��� ��
		
		/*
		 * �ĺ���(Identifier)
		 * 
		 * Ŭ������, �޼ҵ��, ������ �� ����ڰ� ���� �̿��ϴ� ������ �̸�
		 * 
		 * - �ĺ��ڸ� ������ �� �� ���Ѿ��ϴ� ��Ģ(����Ű�� �ȸ������)
		 * 
		 * 1. ��, �ҹ��ڸ� �����ϰ� ���������� ����
		 * 2. ����, ����, _, $�� �ĺ��ڿ� ������ �� ����
		 * 3. ����, _, $�θ� ������ �� ����
		 * 4. ������ ������ �� ����
		 * 5. Ű����(�����)�� �ĺ��ڷ� ����� �� ����
		 * 
		 * 
		 * - �ĺ��� �̸� ��Ģ(�����ڵ��� ���) - �ڵ�������
		 * 
		 * 1. Ŭ����/�������̽� �̸� ��Ģ
		 * 
		 * - ���, ����縦 ���������� �����ؼ� ���
		 * - ù ���ڸ� �빮�ڷ� ǥ��
		 * - ����� �ܾ���� ù���ڵ� �빮�ڷ� ǥ��
		 * 
		 * ex) HelloWorld
		 * 
		 * 
		 * 2. ���� �̸� ��Ģ
		 * 
		 * - ����� �ǹ̸� ���� ����
		 * - ù ���ڸ� �ҹ��ڷ� ǥ��, ����� �ܾ���� �빮�ڷ� ǥ��
		 * 
		 * ex) phoneNumber
		 * 
		 * 
		 * 3. �޼ҵ� �̸� ��Ģ
		 * 
		 * - ������ �ǹ̸� ���� ����
		 * - ù ���ڴ� �ҹ��ڷ� ǥ��, ����� �ܾ���� �빮�ڷ� ǥ��
		 * - �޼ҵ���� ������ ���� �ڿ� �� ���� ��ȣ "()"�� ����
		 * - �޼ҵ���� �Ϲ������� _�� ������� ����
		 * 
		 * ex) calPay(), join()
		 * 
		 * 4. ��� �̸� ��Ģ
		 * 
		 * - ���ڸ� �빮�ڷ� ǥ��
		 * - �ܾ�� �ܾ� ���̴� _�� ����ؼ� �������ش�.
		 * 
		 * ex) LOGIN_OK
		 * 
		 */
		
		// ������ �ڷ���
		
		/*
		 * 1. ���� �ڷ���(�� �� : true, false) 
		 */
		
		boolean isTrue; // 1Byte
		isTrue = true;
		boolean isFalse;
		isFalse = false; // �ִ� �ʱ�ȭ
		isFalse = true; // ��� ����
		
		// ����!!�� �ʱ�ȭ(Initialize)�� �������� ������ ����� �� ����
		
		/*
		 * 2. ������ �ڷ���
		 * 
		 * ���������� 4���� ������ ����
		 * ������ ������ byte, short, int, long���� �ְ� int���� �ַ� ����ϸ� �ȴ�.
		 * �������� �⺻���� int�̰� long���� ����� ���� �Ҵ��� ���� �ڿ� "L"�� �ٿ��� ��
		 * 
		 * �Ǽ������� 2���� ������ ����
		 * �Ǽ��� ������ float, double�̶�� Ű���带 ����ϰ� double�� �����
		 * float���� ����Ϸ��� �Ҵ��� ���� �ڿ� "F"�� �ٿ��� ��
		 * 
		 */
		
		// 2_1. ������
		
		byte bNum = 1; // 1Byte
		short sNum = 2; // 2Byte
		int iNum = 3; // 4Byte
		long lNum; // 8Byte
		lNum = 4L; // long�� ���ͷ�(������ ���� ��)
		
		// 2_2. �Ǽ���
		float fNum = 2.22F; // 4Byte, F�� ������ ������ ����
		double dNum = 3.3333; // 8Byte
		
		// 3. ������
		char ch; // 2Byte
		ch = 'c'; //���� ���ڿ��� �ݵ�� Ȭ����ǥ�� �ٿ���
		
		
		// -------- ��������� �⺻�ڷ���(Primitive Type)
		
		// 4. ���ڿ��� : �����ڷ��� => �ּҸ� ��´�!
		
		String str;
		str = "abc"; // ���ڿ��� ���� ��� �ݵ�� �ֵ���ǥ�� ���δ�.
		
		// 1. 9���� �ڷ����� ������
		// 2. 9���� ���� �ʱ�ȭ�� ������
		// 3. 9���� ���� �� ������ Ȯ���غ���!!!!
		
		
		System.out.println("boolean���� ���� \t isTrue : " + isTrue + "�Դϴ�.");
		System.out.println("byte���� ���� \t bNum : " + bNum + "�Դϴ�.");
		System.out.println("short���� ���� \t sNum : " + sNum + "�Դϴ�.");
		System.out.println("int���� ���� \t iNum : " + iNum + "�Դϴ�.");
		System.out.println("long���� ���� \t lNum : " + lNum + "�Դϴ�.");
		System.out.println("float���� ���� \t fNum : " + fNum + "�Դϴ�.");
		System.out.println("double���� ���� \t dNum : " + dNum + "�Դϴ�.");
		System.out.println("char���� ����  \t ch : " + ch + "�Դϴ�.");
		System.out.println("string���� ���� \t str : " + str + "�Դϴ�.");
		
		// ��¹��� ���� !
		// System.out.println(); => ��������
		// System.out.print(); => �������� ����
		// System.out.printf("����ϰ��� �ϴ� ������ ����); => f�� format, �������� ����
		
		System.out.printf("isTrue�� ���� %b�Դϴ�.\n", isTrue);
		// => ������ ������ �Ų� ���� ������ ����, ������ ��Ȯ�ؾ� �Ѵ�.
		
		// %b : true, false ���� ������ ���� �� �ְ� �վ��ִ� ����
		// %d : byte, short, int, long ������ ������ ���� �� �ְ� �վ��ִ� ����(decimal) 
		// %f : float, double �Ǽ��� ������ ���� �� �ְ� �վ��ִ� ����
		// %c, %C : char ������ ������ ���� �� �ְ� �վ��ִ� ����
		// %s, %S : String ���ڿ��� ������ ���� �� �ְ� �վ��ִ� ����
		System.out.println();
		System.out.printf("fNum�� ���� %.2f�Դϴ�.\ndNum�� ���� %.4f�Դϴ�.\n\n", fNum, dNum);
		
		System.out.println("������ ���ؼ��� \\n�� ����մϴ�.");
		
		
	} //declareVariable ���� ��
	
	// ��� : ���� �������� ���� ����
	
	public void constant() {
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		
		// 1760����� ������ �⵵������ ����ϴ� �޼ҵ�
		// [ǥ����] final �ڷ��� �����̸�;
		
		final int STAR_YEAR = 1760;
		System.out.println(STAR_YEAR);
		
		final double PI = 3.14;
	}
}

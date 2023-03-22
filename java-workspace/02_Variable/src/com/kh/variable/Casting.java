package com.kh.variable;

public class Casting {
	
	/*
	 * ����ȯ(Type Casting) : �ڷ����� �ٲٴ� ����
	 * 
	 * �ڹٿ��� ���� ó���ϴ� ��Ģ
	 * 
	 * 1. =(���Կ�����)�� �������� ����, �������� ���� �ڷ����̾�� �Ѵ�.
	 * => ���� �ڷ����� �ش��ϴ� ���ͷ����� ������ ����
	 * => �ڷ����� �ٸ� ���? ���� �ٲ㼭 �����ؾ� ��
	 * 
	 * 2. ���� �ڷ����鳢���� ������ ������
	 * => �ڷ����� �ٸ��� ������ �ϰ�ʹ�?? �� �� �ϳ��� "����ȯ"�� �ؼ� ������ �ϳ��� �����ϰ� ������ ��
	 * 
	 * 3. ������ ������� ���� �ڷ����̾�� �Ѵ�.
	 * ex) 1 + 1(����), 1.1 + 1.1 = 2.2(�Ǽ�)
	 * 
	 * [ ǥ���� ]   (�ٲ��ڷ���)��
	 * ����ȯ������, cast������
	 * 
	 * ����ȯ�� ����
	 * 
	 * 1. �ڵ�����ȯ(Promotion) : �ڵ����� ����ȯ�� �����
	 * 						      ����ũ���� �ڷ��� -> ū ũ��� �ڷ���
	 * 						      ���� ����ȯ�� �� �ʿ䰡 ����
	 * 
	 * 2. ��������ȯ(Type Casting) : �ڵ�����ȯ�� �̷������ �ʴ� ��쿡 ����
	 * 							    ���� ���� ����ȯ�� �ؾ��� ��!!! => ()�� ���ؼ� ����
	 * 
	 * 
	 */
	
	// �ڵ�����ȯ : ���� ����Ʈ -> ū ����Ʈ
	
	public void autoCasting() {
		
		// 1. int(4Byte, ����) -> double(8Byte, �Ǽ�)
		
		int i1 = 10;
		//System.out.println(i1);
		double d1 = /*(double)*/i1;
		//System.out.println(d1);
		//System.out.println(i1);
		
		// �ڵ�����ȯ �Ϸ�!
		// int�� ���� double�� �Ǽ� d1 = 10 -> 10.0
		
		// 2. int(4Byte, ����) -> long(8Byte, ����)
		
		int i2 = 120;
		long l3 = i2;
		//System.out.println(l3);
		
		// 3. long(8Byte, ����) -> float(4Byte, �Ǽ�)
		// Ư�����̽� ������ �Ǽ��� ��� �� ū �������� ������ ���� �������� �Ǽ��� ���� ����!
		// 4Byte float���� long������ ǥ���� �� �ִ� ���� ������ �� ũ�� ���� (������ ���غ��� ���� ī��Ʈ�� ����)
		
		long l4 = 1000L; //���ͷ��� �⺻������ int������ �ڵ�����ȯ �� ��
		float f5 = l4;
		
		//System.out.println(f5);
		
		// 4. char(2Byte) <-> int(4Byte)
		// �ƽ�Ű�ڵ�
		
		char ch = 'b';
		//System.out.println(ch);
		
		char ch2 = 98;
		//System.out.println(ch2);
		
		int num = ch;
		//System.out.println(num);
				
		/*
		System.out.println('b'); // b
		System.out.println((int)'b'); //98
		System.out.println('b' + 2); //100
		System.out.println('b' + '2'); //148
		System.out.println('b' + "2"); //b2
		
		System.out.println((char)'2');
		System.out.println((char)2);
		*/
		
		// �񱳿�����( == )
		// ���װ� ������ ���� ���ؼ� ������� ��ȯ
		// true, false
		
		/*
		System.out.println('a' == 'b');
		System.out.println(2 == (int)'2'); //2�� 50�� ����??
		System.out.println((char)2 == '2'); //�̻��� ���ڿ� '2'�� ����??
		System.out.println((int)'2' == '2'); //true
		*/
		
		// 5. byte, short���� ����
		
		// -128 ~ 127
		
		byte b1 = 126;
		byte b2 = 2;
		
		System.out.println(b1+b2);
		
		//������� int�� => CPU�� ���� ó���ϴ� �⺻ũ�Ⱑ int�� ũ��(4Byte)
		
		byte b3 = (byte) 128;
		System.out.println(b3);
	}
	// ��������ȯ : ū ����Ʈ -> ���� ����Ʈ
	public void forceCasting() {
		
		// ����� ����ȯ�̶�� ��
		// (�ٲ��ڷ���)��
		
		// 1. double(8Byte) -> float(4Byte)
		
		double d1 = 8.0;
		
		float f1 = (float)d1;
		
		//System.out.println(f1);
		
		// 2. double(8Byte) -> int(4Byte)
		
		double d2 = 10.123213;
		
		int i1 = (int)d2;
		
		System.out.println(i1);
		
		// 0.123213 �Ҽ��� �� �κ��� ����!! => �����Ͱ� �ս�
		
	}
}

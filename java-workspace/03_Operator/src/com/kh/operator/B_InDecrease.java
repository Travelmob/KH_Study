package com.kh.operator;

public class B_InDecrease {
	/*
	 * ���������� : ���׿����ڷμ� �ѹ��� 1�� ����(���ϰų�) ����(���ų�)�ϴ� ������ �Ѵ�.
	 * => ���� ������ �Ұ���, ���߿� ������ �Ұ����� ���� �������� ��ġ�� �޶�����.
	 * 
	 * [ ǥ���� ]
	 * ++ : ���� 1���� ������Ű�� ������
	 * -- : ���� 1���� ���ҽ�Ű�� ������
	 * 
	 * �������� ��ġ
	 * ���� ���� : ++��, --��         --> ���� ���� �����ϰ� �� ���� ó��
	 * ���� ���� : ��++, ��--    --> ���� ó���ϰ� ���� �����ϰų� �����ϰڴ�.
	 * 
	 *
	 * 
	 */
	
	// ���� ����
	public void method1() {
	
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++; // num�̶�� �̸��� ���� ���������� �����ٰ� 1�� ������Ű�ڴ�.
		
		System.out.println("num : " + num); // 11
		
		num--;
		
		System.out.println("num : " + num); // 10
		
		System.out.println("num : " + num++); //10
		System.out.println("num : " + num++); //11
	
	}
	
	// ��������
	public void method2() {
		
		int a = 10;
		int b = a++;
		// 1�� b��� int�� ���������� ����
		// 2�� a��� ���������� ���ͷ� ���� ������
		// 3�� ������ ���ͷ� ���� b��� ������ ����
		// 4�� a�� 1����
		
		System.out.println("a : " + a); //11
		System.out.println("b : " + b); //10
		// b��� ������ a���� ���� �����ϰ�(�� ó�� �κ�)
		// a��� ���� ������Ű�ڴ�(�� ����)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); //
		System.out.println("d : " + d); //
		
	}
	
	// ��������
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11
		
		System.out.println("a : " + --a); // 10
	}
	
	
	public void method4() {
		// ���� ����
		int num1 = 20;
		int result = num1++ *3;
		
		System.out.println(num1); //21
		System.out.println(result); //60
		
		// ���� ����
		int num2 = 20;
		int result2 = ++num2 *3;
		
		System.out.println(num2);
		System.out.println(result2);
		
	}
}

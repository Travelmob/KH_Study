package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		
		// methodA();
		// printMyName();
		/*
		 * �ٸ� Ŭ������ �����ϴ� �޼ҵ���� ȣ�� �� ����??
		 * 1. ȣ���� �޼ҵ尡 �����ϴ� Ŭ������ ����(new)�� ����� ��!
		 * [ ǥ���� ]
		 * "Ŭ�����̸�" "Ŭ������ �뺯�� �̸�(����)" = new Ŭ�����̸�();
		 * 
		 * ���߿� ��ü�ð��� �̷������� ��� �ٷﺼ ��!
		 *
		 */
		
		MethodController mc = new MethodController();
		
		// . ���������� / �������ٿ�����
		mc.methodA();
		mc.methodB();
		mc.methodC();
	}

}

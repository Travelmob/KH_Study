package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController1;
import com.kh.chap06.controller.MethodController2;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		MethodController1 mc1 = new MethodController1();
		
		/*
		mc1.method1();
		System.out.println(mc1.method2());
		String na = mc1.method2();
		System.out.println(na);
		*/
		
		//mc1.method3();
		//System.out.println(mc1.method3());
		//mc1.method4(1, 10);
		//mc1.method5(5);
		
		//mc1.abc(new MethodController1());
		//mc1.abc(mc1); // ��������
		//mc1.abc(2.34);
		
		/*
		OverloadingController oc = new OverloadingController();
		
		oc.test();
		oc.test(1);
		oc.test("����", 1);
		oc.test(1,"����");
		oc.test(1, 2);
		oc.test(1, 2,"����");
		*/
		
		// static : ��ü�� �������� �ʾƵ� ��� ����
		// Math.random();
		// [ ǥ���� ] ǮŬ�������.�޼ҵ�ĺ���();
		
		// Math�� ǮŬ���� ��� java.util.Scanner�� ǮŬ���� ��� �̸� import ���� �� ����
		
		MethodController2.method2();
		String str = MethodController2.method2();
		System.out.println(MethodController2.method2());
		MethodController2.method3("�̸�");
		System.out.println(MethodController2.method4("ȫ�浿"));
	}

}

package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		//  ------------------ 1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1();
		// 1. stack ������ f1�̶�� �������� ����
		// ��ü ���� �� (new Ű���带 ������ ��) global ������� �Ҵ�!
		System.out.println(f1.global);
		f1.testVariable(8);
		// testVariable ȣ�� ��! num, local �������� �Ҵ�!(stack)
		// testVariable ȣ�� ���� ��! num, local �������� �Ҹ�!
		System.out.println(f1.global);
		f1 = null; // global ��� �Ұ���
		System.out.println(f1.global);
		*/
		// -------------------- 3. FieldTest3 ---------------
		
		System.out.println(FieldTest3.str); // ��ü�� �������� �ʾƵ� ���α׷� ���� ���̸� ���� ����
		
		FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.str);
		System.out.println(FieldTest3.NUM);
		
		//FieldTest3.NUM = 33; ���� �Ұ�
		
		System.out.println(f3.str);
		System.out.println(f3.str2);
		
		
		
	}

}

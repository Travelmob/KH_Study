package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		
		// 1. �⺻�����ڸ� ����ؼ� ��ü�� ����
		User user = new User();
		
		// 2. ��ü ������ ���ÿ� �ʵ尪�� �ʱ�ȭ
		// ���̵�, ���, �̸�
		User user02 = new User("user01", "pass01", "����01");
		System.out.println(user02.information());
		
		// 3. �����ڷ� ��� �ʵ� �ʱ�ȭ!
		User user03 = new User("user02", "pass02", "����02", 10);
		System.out.println(user03.information());

	}

}

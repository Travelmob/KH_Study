package com.kh.chap01.abstraction.model.vo;

/*
 * public class Ŭ�����̸�{
 * 
 * 		// �ʵ��
 * 
 * 		// �����ں�
 * 
 * 		// �޼ҵ��
 * 
 * }
 */

public class Dog {
	
	// [ �ʵ�� ] : Ŭ�������� �����ϴ� ����
	// ���������� �ڷ��� �ʵ��̸�;
	
	// ���������� : �� �ʵ忡 ������ �� �ִ� ������ ������ �� ���� (������ ������ default�� ��)
	//		public > protected > default > private
	// Ŭ���� �ȿ��� �ʵ带 ������ ���� �ݵ�� ���������ڸ� ���� ��
	
	// �̸�, ��, ����, ����, ����, ������
	public String name;
	public String breed;
	public String gender;
	public int age;
	public String owner;
	public int weight;
	
	
	
	// [ �����ں� ]
	
	
	// [ �޼ҵ�� ]
	
	public void bow() {
		System.out.println(name + "�� �۸��ϰ� ¢���ϴ�.");
	}
	
	// �󸶳�
	public void eat(int kg) {
		if(weight < 100) {
		weight += kg;		
	} else {
		System.out.println("�ȸԾ�~");
	}
	}
}
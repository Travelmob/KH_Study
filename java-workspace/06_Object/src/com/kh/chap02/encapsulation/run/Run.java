package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/*
	 * ĸ��ȭ ������ ���� �Ϻ��� Ŭ���� ���¸� ���߰� ����!!
	 * 
	 * ���������� 3��� : ��м�, ���Ἲ, ���뼺
	 * 
	 * ĸ��ȭ�� �������� ������ : �ܺηκ��� ���� ������ �����ϱ� ������ �Ժη� ���� �����ǰų� ��ȸ�� �� ����
	 * 
	 * => ĸ��ȭ : ���� ���� ��� �� �ϳ�!
	 * 
	 * �������� "��������"�� ��Ģ���� �ܺηκ��� ���������� ���� ���!
	 * 
	 * => ĸ��ȭ �۾��� 2�ܰ�
	 * 1. ���� ����� : public ��� private���� ���������ڸ� �ٲ��ش�.
	 * 2. ���������� ���� ó���� �� �ִ� �޼ҵ带 �����.
	 */
	
	
	// ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����)
	public static void main(String[] args) {
		
		Student sim = new Student();
		/*
		sim.name = "������";
		sim.gender = 'F';
		sim.age = 20;
		
		System.out.println("�̸��� " + sim.name + "�̸� ������ " + sim.gender + "�̰� ���̴� " + sim.age + "�Դϴ�.");
		*/
		
		// �ʵ尡 ������ �ʾƼ� ���� �߻�!! => private���� �����߱� ������ ���������� �Ұ�!!
		// ���������� �������� ���������� ������ �� �ְԲ� => getter/setter �޼ҵ� �����!
		
		sim.setName("������");
		sim.setAge(20);
		sim.setGender('F');
		
		//System.out.println(sim.name);
		
		String simName = sim.getName();
		int simAge = sim.getAge();
		char simGender = sim.getGender();
		
		System.out.println(simName);
		System.out.println(simAge);
		System.out.println(simGender);
		
		Student kim = new Student();
		
		kim.setName("��");
		
		System.out.println(sim.information());
		
	}
	
}

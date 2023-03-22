package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {
		
		// ���� ���� ������ �ڷ���(1. �����ڷ���, 2. �ּҰ��� ����, 3. �������� �ڷ����� �������� ���� ���� + ���)
		// == ����� ���� �ڷ���
		// Person�̶�� Ŭ������ ���� ��ü ����
		
		Person person = new Person(); // �ν��Ͻ�ȭ instance
		
		person.setName("���¿�");
		person.setAge(35);
		person.setGender('M');
		person.setPersonid("890217-*******");
		person.setPhone("010-5685-****");
		person.setEmail("jty*****@naver.com");
		
		String name = person.getName();
		int age = person.getAge();
		char gender = person.getGender();
		String personId = person.getPersonid();
		String phone = person.getPhone();
		String email = person.getEmail();
		
		System.out.println(person.information());

		System.out.println("-----------------------");
		
		Product product = new Product();
		
		product.setProductName("�����");
		product.setPrice(3000);
		product.setColor("Black");
		product.setBrand("���");
		
		int price = product.getPrice();
		
		System.out.println(product.information());
	}

}
package com.kh.chap03.run;

import com.kh.chap03.model.vo.Person;
import com.kh.chap03.model.vo.Product;

public class Run {
	
	public static void main(String[] args) {
		
		// 내가 만든 나만의 자료형(1. 참조자료형, 2. 주소값을 저장, 3. 여러개의 자료형에 여러개의 값을 보관 + 기능)
		// == 사용자 정의 자료형
		// Person이라는 클래스를 통해 객체 생성
		
		Person person = new Person(); // 인스턴스화 instance
		
		person.setName("전태영");
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
		
		product.setProductName("새우깡");
		product.setPrice(3000);
		product.setColor("Black");
		product.setBrand("농심");
		
		int price = product.getPrice();
		
		System.out.println(product.information());
	}

}
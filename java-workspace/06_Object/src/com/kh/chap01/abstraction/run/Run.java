package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.model.vo.Dog;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 * 객체지향 프로그래밍 : 현실세계에서의 독립적인 존재(객체)를 속성과 행위를 가지게 만들어서,
		 *                객체간의 상호작용을 프로그래밍 언어로 구현하는 것
		 *                
		 * 구현하고자 하는 프로그램 상의 객체(변수)를 만들기 위해서는(생성하기 위해서는)               
		 * => 클래스라는 틀을 먼저 만들어야 한다. 
		 * 클래스란?? 각 객체들 정보(속성, 행위)들을 담아내는 그릇 또는 틀
		 * 
		 * 클래스 : VO(Value Object)
		 * 다른 말로 사용자 정의 자료형이라고도 함         
		 * 
		 */
	
		
		// 이름, 종, 성별, 나이, 주인, 몸무게
		// 준혁씨네 강아지 이름은 크롱이
		//			종은 프렌치불독
		//			성별은 남자
		//			나이는 3살
		//			주인은 조준혁씨
		//			몸무게는 2kg
		
		// 자료형 변수식별자;
		Dog d1 = new Dog(); // 참조자료형
				// new 키워드 사용!! 메모리의 heap영역에 할당 => 객체를 생성한다
		Dog d2 = new Dog();
		
		d1.name = "크롱이";  // 변수(참조자료형 변수의 주소값).(참조연산자 & 직접접근연산자)필드(클래스 변수)
		d1.breed = "프렌치불독";
		d1.gender = "남자";
		d1.age = 3;
		d1.owner = "조준혁";
		d1.weight = 2;
		
		System.out.println(d1.name + "은(는) " + d1.breed + "이고 " + 
							d1.gender + "이며, 나이는 " + d1.age + 
							"살 이고, 주인은 " + d1.owner + "이며, 몸무게는 "
							+ d1.weight + "kg입니다.");
		
		
		d2.name = "니니";
		d2.breed = "닥스훈트";
		d2.gender = "여자";
		d2.age = 1;
		d2.owner = "이승철";
		d2.weight = 1;
		
		System.out.println(d2.name + "은(는) " + d2.breed + "이고 " +
							d2.gender + "이며, 나이는 " + d2.age +
							"살 이고, 주인은 " + d2.owner + "이며, 몸무게는 "
							+ d2.weight + "kg입니다.");
		
		d1.bow();
		d2.bow();
		
		d1.eat(1);
		
		System.out.println(d1.name + "의 몸무게는 : " + d1.weight);
		
		for(int i = 0; i < 100; i++) {
			d1.eat(1);
		}
	
		System.out.println(d1.name + "의 몸무게는 : " + d1.weight);
		
		d1.age = 99;
		
		System.out.println(d1.age);
		
		
	}

}

package com.kh.chap04.model.vo;

// 클래스 변수(static 필드)와 상수 필드(static final)에 대해!
public class FieldTest3 {
	
	// 필드(field)
	// [ 표현법 ]
	// 접근 제한자 예약어(생략가능) 자료형 필드식별자
	
	public static String str = "static field"; // static을 붙이면 변수가 이탤릭체로 변함
	public String str2 = "어쩌고저쩌고";
	
	// 생성시점 : 프로그램 실행과 동시에 메모리의 static 영역에 할당!
	// 소멸시점 : 프로그램 종료 시 소멸
	// => 객체를 생성하지 않고 static 영역에 할당됨!!
	
	// static "공유"의 개념이 강함!
	// 프로그램 실행과 동시에 메모리영역에 공간을 할당해두고 그 안에 값을 공유해서 쓰자~
	// static이 붙으면 접근제한자 public을 주로 사용함
	
	/*
	 * 상수 필드
	 * 
	 * [ 표현법 ]
	 * public static final 자료형 상수필드이름값 = 값;
	 * => 예약어 순서는 상관없음 public final static으로 써도 됨
	 * => 한 번 지정한 값을 고정해서 쓰겠다. 그래서 무조건 초기화를 해줘야 함!!!!
	 *
	 * static : 공유의 개념(재사용성)
	 * final : 한 번 지정해놓고 변경하지 않겠다(상수 선언)
	 * 
	 * 값이 변경되어서는 안되는 고정적인 값들을 메모리상(static)에 올려놓고 공유할 목적
	 * (프로그램 시작과 동시에 메모리영역에 할당, 값이 변하지도 않게끔 만듦)
	 * 
	 * 상수필드 이름도 반드시 항상 모두 대문자여야함!!!!
	 * 
	 */
	
	public static final int NUM = 10;
	double a = Math.random();
	
	/*
	 * Math클래스 random()
	 * 클래스를 올리지 않고 호출 가능했던 이유?
	 * random()가 static 예약어가 붙은  random 메소드라서
	 * 
	 * 
	 */

}

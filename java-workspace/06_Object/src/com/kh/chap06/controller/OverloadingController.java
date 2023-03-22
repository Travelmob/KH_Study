package com.kh.chap06.controller;

public class OverloadingController {
	
	/*
	 * 메소드 오버로딩
	 * 
	 * - 한 클래스 안에 같은 메소드명으로 여러 메소드들을 정의할 수 있는 방법!
	 * - 매개변수 자료형의 개수, 순서, 종류 다 다르게 작성해야 함
	 * - 단 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 영향을 끼치지 않음.
	 *
	 */
	
	//메소드명은 test로 통일
	public void test() {
		System.out.println("어쩌고저쩌고"); // scout -> ctrl + space
		System.out.println("1번메소드");
	}
	
	public void test(int a) {
		System.out.println("안녕 나는 인트 a야");
	}
	
	public void test(int a, String s) {
		System.out.println("안녕 나는 인트 a 스트링 s야");
	}
	
	public void test(String s, int a) {
		System.out.println("안녕 나는 스트링 s 인트 a야");
	}
	
	public void test(int a, int b) {
		System.out.println("안녕 나는 인트 두개야");
	}
	
	/*
	public void test(int c, int d) {
		System.out.println("안녕 나는 인트 두개야");
	}
	- 정수형 두 개를 받는 test를 하나 더 만든다면??
	     매개변수의 이름과는 상관없이 자료형의 개수, 순서가 같기 때문에 에러가 발생!!
	     즉 매개변수 자료형의 개수와 순서를 항상 다르게 작성해야만한다!!
	*/
	
	public void test(int a, int b, String s) {
		System.out.println("뭐시기뭐시기");
	}
	
	/*
	public int test(int a, int b, String s) {
		return 123;
	}
	- 반환형이 다르다고 오버로딩이 적용되지 않음
	     메소드 호출하는 시점에서 매개변수가 동일하면 무조건 에러가 발생
	     반환형과 상관없이 매개변수의 개수와 순서가 다르게 작성되어야한다.
	*/
	/*
	private void test(int a, int b, String s) {
		System.out.println("나는 숨겼어");
	}
	- 접근 제한자가 다르다고 오버로딩이 적용되지 않음
	     접근제한자와는 상관없이 매개변수 자료형의 개수와 순서는 다르게 작성되어야한다~
	*/

}

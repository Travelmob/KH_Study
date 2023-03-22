package com.kh.second;

public class Run {
	
	public static void main(String[] args) {
		
		// methodA();
		// printMyName();
		/*
		 * 다른 클래스에 존재하는 메소드들을 호출 할 때는??
		 * 1. 호출할 메소드가 존재하는 클래스를 생성(new)을 해줘야 함!
		 * [ 표현법 ]
		 * "클래스이름" "클래스를 대변할 이름(별명)" = new 클래스이름();
		 * 
		 * 나중에 객체시간에 이론적으로 깊게 다뤄볼 것!
		 *
		 */
		
		MethodController mc = new MethodController();
		
		// . 참조연산자 / 직접접근연산자
		mc.methodA();
		mc.methodB();
		mc.methodC();
	}

}

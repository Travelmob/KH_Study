package com.kh.chap06.controller;

public class MethodController1 {

	/*
	 * 메소드(Method) : 입력을 가지고 어떤 일을 수행한 다음에 결과물을 내놓는다!!
	 * 
	 * [ 표현법 ]
	 * 접근제한자 예약어 반환형 메소드식별자(매개변수의 자료형 매개변수식별자){
	 * 
	 * 			수행할 코드;
	 * 
	 * 			return 반환값
	 * }
	 * 생략 가능한 것 : 예약어, 매개변수, return문(반환형이 void일 경우!)
	 * 반환형 : 반환할 값의 자료형
	 * 한 번 정의해두고 필요할 때마다 호출! 언제든!!!
	 * 호출할 때 인자값 => 매개변수의 자료형과 개수가 일치해야 함!!!!! 반드시!!! 꼭!!! 무조건!!!
	 * 
	 * 
	 */
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		int sum = 0;
		for(int i = 0; i <=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		// return;
		// 반환형이 void일 경우 return을 생략 가능하다 JVM이 자동으로 만들어줌!!!
	}
	
	// 2. 매개변수는 없지만 반환값은 있는 메소드
	public String method2() {
		System.out.println("매개변수는 없지만 반환값은 있는 메소드입니다.");
		return "나를 돌려줄게";
	}
	
	public String method3() {
		return method2();
	}
	
	// 3. 매개변수는 있고 반환값은 없는 메소드
	public void method4(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드입니다.");
		
		System.out.println(num1 +num2);
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method5(int a) {
		System.out.println("매개변수도 있고 반환값도 있는 메소드입니다");
		return a + 2;
	}
	
	/*
	 * 반환값이 없는 메소드 : 출력문을 작성하는 편
	 * 반환값이 있는 메소드 : 호출하는 부분에서 출력문을 작성
	 */
	
	public void abc(MethodController1 mc1) {
		
		mc1.method4(2,  3);
	}
}

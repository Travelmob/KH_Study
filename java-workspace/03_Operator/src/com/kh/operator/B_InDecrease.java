package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자 : 단항연산자로서 한번에 1씩 증가(더하거나) 감소(빼거나)하는 연산을 한다.
	 * => 먼저 증감을 할건지, 나중에 증감을 할건지에 따라서 연산자의 위치가 달라진다.
	 * 
	 * [ 표현법 ]
	 * ++ : 값을 1씩만 증가시키는 연산자
	 * -- : 값을 1씩만 감소시키는 연산자
	 * 
	 * 연산자의 위치
	 * 전위 연산 : ++값, --값         --> 먼저 값을 증감하고 그 값을 처리
	 * 후위 연산 : 값++, 값--    --> 값을 처리하고 나서 증가하거나 감소하겠다.
	 * 
	 *
	 * 
	 */
	
	// 후위 연산
	public void method1() {
	
		int num = 10;
		System.out.println("num : " + num); // 10
		
		num++; // num이라는 이름을 가진 변수공간의 값에다가 1을 증가시키겠다.
		
		System.out.println("num : " + num); // 11
		
		num--;
		
		System.out.println("num : " + num); // 10
		
		System.out.println("num : " + num++); //10
		System.out.println("num : " + num++); //11
	
	}
	
	// 후위연산
	public void method2() {
		
		int a = 10;
		int b = a++;
		// 1번 b라는 int형 변수공간을 만듬
		// 2번 a라는 변수공간의 리터럴 값을 가져옴
		// 3번 가져온 리터럴 값을 b라는 공간에 대입
		// 4번 a를 1증가
		
		System.out.println("a : " + a); //11
		System.out.println("b : " + b); //10
		// b라는 변수에 a값을 먼저 대입하고(선 처리 부분)
		// a라는 값을 증가시키겠다(후 연산)
		
		int c = 20;
		int d = c--;
		
		System.out.println("c : " + c); //
		System.out.println("d : " + d); //
		
	}
	
	// 전위연산
	public void method3() {
		
		int a = 10;
		int b = ++a;
		
		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11
		
		System.out.println("a : " + --a); // 10
	}
	
	
	public void method4() {
		// 후위 연산
		int num1 = 20;
		int result = num1++ *3;
		
		System.out.println(num1); //21
		System.out.println(result); //60
		
		// 전위 연산
		int num2 = 20;
		int result2 = ++num2 *3;
		
		System.out.println(num2);
		System.out.println(result2);
		
	}
}

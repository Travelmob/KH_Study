package com.kh.variable;

public class Casting {
	
	/*
	 * 형변환(Type Casting) : 자료형을 바꾸는 개념
	 * 
	 * 자바에서 값을 처리하는 규칙
	 * 
	 * 1. =(대입연산자)를 기준으로 왼쪽, 오른쪽이 같은 자료형이어야 한다.
	 * => 같은 자료형에 해당하는 리터럴값만 대입이 가능
	 * => 자료형이 다를 경우? 값을 바꿔서 대입해야 함
	 * 
	 * 2. 같은 자료형들끼리만 연산이 가능함
	 * => 자료형이 다른데 연산이 하고싶다?? 둘 중 하나를 "형변환"을 해서 나머지 하나와 동일하게 만들어야 함
	 * 
	 * 3. 연산의 결과물도 같은 자료형이어야 한다.
	 * ex) 1 + 1(정수), 1.1 + 1.1 = 2.2(실수)
	 * 
	 * [ 표현법 ]   (바꿀자료형)값
	 * 형변환연산자, cast연산자
	 * 
	 * 형변환의 종류
	 * 
	 * 1. 자동형변환(Promotion) : 자동으로 형변환이 진행됨
	 * 						      작은크기의 자료형 -> 큰 크기로 자료형
	 * 						      내가 형변환을 할 필요가 없음
	 * 
	 * 2. 강제형변환(Type Casting) : 자동형변환이 이루어지지 않는 경우에 진행
	 * 							    직접 내가 형변환을 해야할 때!!! => ()을 통해서 진행
	 * 
	 * 
	 */
	
	// 자동형변환 : 작은 바이트 -> 큰 바이트
	
	public void autoCasting() {
		
		// 1. int(4Byte, 정수) -> double(8Byte, 실수)
		
		int i1 = 10;
		//System.out.println(i1);
		double d1 = /*(double)*/i1;
		//System.out.println(d1);
		//System.out.println(i1);
		
		// 자동형변환 완료!
		// int는 정수 double은 실수 d1 = 10 -> 10.0
		
		// 2. int(4Byte, 정수) -> long(8Byte, 정수)
		
		int i2 = 120;
		long l3 = i2;
		//System.out.println(l3);
		
		// 3. long(8Byte, 정수) -> float(4Byte, 실수)
		// 특이케이스 정수가 실수에 담길 때 큰 사이즈의 정수가 작은 사이즈의 실수에 대입 가능!
		// 4Byte float형이 long형보다 표현할 수 있는 값의 범위가 더 크기 때문 (개수로 비교해보자 정수 카운트는 적다)
		
		long l4 = 1000L; //리터럴은 기본적으로 int형으로 자동형변환 된 것
		float f5 = l4;
		
		//System.out.println(f5);
		
		// 4. char(2Byte) <-> int(4Byte)
		// 아스키코드
		
		char ch = 'b';
		//System.out.println(ch);
		
		char ch2 = 98;
		//System.out.println(ch2);
		
		int num = ch;
		//System.out.println(num);
				
		/*
		System.out.println('b'); // b
		System.out.println((int)'b'); //98
		System.out.println('b' + 2); //100
		System.out.println('b' + '2'); //148
		System.out.println('b' + "2"); //b2
		
		System.out.println((char)'2');
		System.out.println((char)2);
		*/
		
		// 비교연산자( == )
		// 좌항과 우항의 값을 비교해서 결과값을 반환
		// true, false
		
		/*
		System.out.println('a' == 'b');
		System.out.println(2 == (int)'2'); //2와 50이 같아??
		System.out.println((char)2 == '2'); //이상한 문자와 '2'가 같아??
		System.out.println((int)'2' == '2'); //true
		*/
		
		// 5. byte, short간의 연산
		
		// -128 ~ 127
		
		byte b1 = 126;
		byte b2 = 2;
		
		System.out.println(b1+b2);
		
		//결과값이 int형 => CPU가 값을 처리하는 기본크기가 int형 크기(4Byte)
		
		byte b3 = (byte) 128;
		System.out.println(b3);
	}
	// 강제형변환 : 큰 바이트 -> 작은 바이트
	public void forceCasting() {
		
		// 명시적 형변환이라고도 함
		// (바꿀자료형)값
		
		// 1. double(8Byte) -> float(4Byte)
		
		double d1 = 8.0;
		
		float f1 = (float)d1;
		
		//System.out.println(f1);
		
		// 2. double(8Byte) -> int(4Byte)
		
		double d2 = 10.123213;
		
		int i1 = (int)d2;
		
		System.out.println(i1);
		
		// 0.123213 소수점 뒷 부분이 절삭!! => 데이터가 손실
		
	}
}

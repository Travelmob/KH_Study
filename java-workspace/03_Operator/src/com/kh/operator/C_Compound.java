package com.kh.operator;

public class C_Compound {

	/*
	 * 복합 대입 연산자 : "=" 대입 연산자
	 * 
	 * 다른 산술연산자랑 대입연산자가 결합한 것
	 * => 자기자신과 해당 산술연산 후 그 결과를 자기자신에게 덮어씌우는 것
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * ex) int a = 1;
	 * 	   a = = a + 3;
	 * 	기존에 존재하는 a라는 변수공간 값에 3을 더하고 그 결과값을 다시 a에 대입하겠다.
	 * 		a += 3;
	 */
	
	// int veryBicNumber = 1000000;
	// veryBigNumber = veryBicNumber + 100;
	// veryBigNumber += 100;
	
	public void method1() {
		
		int num = 12;
		System.out.println("현재 num : " + num); // 1.12
		
		// num을 3 증가시키기
		num = num + 3;
		System.out.println("3을 증가시킨 num : " + num); // 2.15
		
		// num을 3 증가시키기
		num += 3;
		System.out.println("3을 또 증가시킨 num : " + num); // 3.18
		
		// num을 3 감소시키기
		num -= 3;
		System.out.println("3을 감소시킨 num : " + num); // 4.15
		
		// num을 3배 증가시키기
		num *= 3;
		System.out.println("3배 증가시킨 num : " + num); // 5.45
		
		// num을 2배 감소시키기
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num); // 6.22
		
		// num을 2로 나눈 나머지를 num에 대입
		num %= 2;
		System.out.println("num을 2로 나눈 나머지를 대입한 값 : " + num); //7.0
	
	}
}

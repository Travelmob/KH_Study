package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	/*
	 * 산술 연산자 => 이항 연산자, 우선순위가 일반 수학 산술과 동일
	 */
	
	// + : 덧셈
	// - : 뺄셈
	// * : 곱셈
	// / : 나눗셈
	// % : 모듈러(Modular) => 나눗셈에서의 나머지를 구함

	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 : " + num1 + "\nnum2 : " + num2);
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		
		// 결과값은 : "num1 + num2 : 103"
		// (num1 + num2) 괄호로 묶어줘야 13이라는 결과값이 나옴!
		// 묶지 않고 연산하면 String(문자열)로 인식하기 때문에
		// "10" + "3" 결과값으로 "103"이 찍힘!!!
		
		System.out.println("num1 - num2 : " + (num1 - num2));
		
		// 뺄셈의 경우 괄호로 묶지않으면
		// 문자열과 num1을 하나로 묶은 뒤 정수를 빼기 때문에 오류 발생!
		
		System.out.println("num1 X num2 : " + num1 * num2);
		System.out.println("num1 / num2 : " + num1 / num2);
		System.out.println("num1 % num2 : " + num1 % num2);
		
		// *, /, % 우선순위가 +, -보다 높기 때문에 묶지 않아도 먼저 연산
		// 단, 가독성을 위해 괄호를 사용하는 것을 권장
		
		// * 특이케이스
		//System.out.println();
		// 정수를 0으로 나눌순 없음!
		// ArithmetricExeption : / zero
		
		

	}
	
	// 어린이날 선물 나눠주기 프로그램
	
	// 메소드명 : presentToChild()
	// 입력받을 값 : 1. 어린이의 인원 수
	//          2. 선물 개수
	
	// 1인당 가질수 있는 선물의 개수 : 선물 개수 / 어린이 수
	// 남은  선물의 수 : 선물개수 % 어린이 수 
	
	// 출력 형식
	// 어린이 1인당 가질 수 있는 선물의 개수: X개
	// 남는 선물의 개수 : X개
	
	public void present() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어린이 인원 수를 입력해 주세요 : ");
		int child = sc.nextInt();
		
		System.out.println("총 선물 개수를 입력해 주세요 : ");
		int present = sc.nextInt();
		
		System.out.printf("어린이 1인당 가질 수 있는 선물의 개수 : %d개\n", present / child);
		System.out.printf("남은 선물의 개수 : %d개", present % child);
		
		sc.close();
	}
}

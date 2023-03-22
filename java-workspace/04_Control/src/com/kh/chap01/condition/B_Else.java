package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/* 
	 * if-else
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식) {
	 * 		조건식이 true일 때 실행할 코드 - 1
	 * } else {
	 * 		조건식이 false일 때 실행할 코드 - 2
	 * }
	 * 
	 * => 조건식의 결과가 true일 경우 1을 실행
	 * => 조건식의 결과가 false일 경우 2를 실행
	 * 
	 */
	
	public void method1() {
	
		// 연산자문제
		// 정수 입력받아서 양수 / 0 / 음수
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요 > ");
		int num = sc.nextInt();
		
		// 만약에 사용자가 입력한 정수값이 양수(0보다 크다면)
		// if             num      > 0
		
		if(num > 0) { // 양수일 경우 이 코드블럭 내부를 실행하겠다.
			
			System.out.println("양수다 ~ ");
			
			// 조건식의 결과가 true => else 블럭을 건너 뜀
			// 불필요한 연산이 줄어듬 => 처리속도 향상
			
		} else { // 양수가 아닐 경우 실행
			
			if(num == 0) { // 0일 경우
				System.out.println("0이다~");
			} else {
				System.out.println("음수다~");
			}
			
		}
		
	}
	
	public void method2() {
		// 주민번호 입력 후 성별 판별
		
		// 1. 사용자로부터 주민번호 입력받기 (String personId => XXXXXX - OXXXXXX)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요(-포함) : ");
		String personId = sc.next();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출 charAt(index) => 7번 인덱스
		
		char gender = personId.charAt(7);
		
		System.out.println(gender);
		
		// gender == '1' || gender == '2' || gender == '3' || gender == '4'
		// 가정(!!!!!)   ?? = 49 || ?? == 50 || ?? == 51 || ?? ==52
		if('1' < gender && gender <= '4') {
			
			// 유효한 주민번호를 입력했을 경우
			if (gender == '1' || gender == '3') {
				System.out.println("남자입니다.");
			} else {
				if(gender == '2' || gender == '4') {
					System.out.println("여자입니다.");
				} else System.out.println("????????");
			}
			
		} else {
			// 유효한 주민번호를 입력하지 않았을 경우
			System.out.println("유효하지 않은 주민번호입니다~~");
		}
	}
	
	/*
	 * 
	 * if-else if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if(조건식1){
	 * 		조건식 1이 true일 경우 실행할 코드1
	 * } else if(조건식2) {
	 * 		조건식 2가 true일 경우 실행할 코드2
	 * } else if(조건식3) {
	 * 		조건식 3이 true일 경우 실행할 코드3
	 * } else if(조건식4) {
	 * 		조건식 4가 true일 경우 실행할 코드4
	 * } else {
	 * 		앞에서 기술했던 모든 조건들이 false일 경우 실행할 코드
	 * }
	 */
	
	public void method3() {
		
		// 정수 입력받아서 양수 / 0 / 음수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 " );
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 큰 수~ ");
		} else if(num < 0) {
			System.out.println("0보다 작은 수~ ");
		} else {
			System.out.println("0~");
		}
	}
	
	public void method4() {
		// 나이를 입력받고 어린이/청소년/성인 판단
		// 0  ~ 13 : 어린이
		// 14 ~ 19 : 청소년
		// 20 ~	   : 성인
		// -	   : ????
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		// 큰 범위의 값 순서대로
		
		/* 잘못
		if(age >= 0 && age <= 13) {
			System.out.println("어린이입니다");
		} else if(age >= 14 && age <= 19) {
			System.out.println("청소년입니다");
		} else if(age >= 20) {
			System.out.println("성인입니다");
		} else {
			System.out.println("????");
		}
		*/
		
		// 정정
		if(age < 0) {
			System.out.println("????");
		} else if(age >= 20) {
			System.out.println("성인입니다");
		} else if(age >= 14) {
			System.out.println("청소년입니다");
		} else {
			System.out.println("어린이입니다");
		}
	}
}

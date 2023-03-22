package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리 연산자 : 두 개의 논리값을 연산하는 연산자
	 * 
	 * [ 표현법]
	 * 
	 * 논리값 논리연산자 논리값          => 결과값도 논리값
	 * 
	 * 종류
	 * 
	 * 1. AND연산자 : 논리값 && 논리값
	 * 좌항과 우항의 값이 모두 true여야만 최종 결과가 true
	 * 
	 * 2. OR연산자 : 논리값 || 논리값
	 * 좌항과 우항의 값 중 하나라도 true이면 최종 결과가 true
	 *
	 * 
	 */
	
	//AND
	public void method1() {
		
		//사용자가 입력한 정수 값이 양수 이면서(이고) 짝수인지 확인!
		//                num > 0
		//                            num % 2 == 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 ! > ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num % 2 == 0);
		//               사용자가 입력한 정수가 0보다 크고 2로 나눴을 때 0인가요?
		// && 의미 : ~~이면서, ~~이고, 그리고 
		
		System.out.println("사용자가 입력한 정수가 양수이면서 짝수인가요? : " + result);
		
		sc.close();
	}
	
	public void method2() {
		//사용자에게 정수값을 입력받아 1이상 100이하인지 확인해보기!
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num2 = sc2.nextInt();
		
		// 1<= num <= 100
		
		boolean result2 = (1 <= num2) && (num2 <= 100);
		//			num이 1보다 크거나 같고 "그리고" num이 100보다 작거나 같니?
		
		System.out.println("사용자가 입력한 정수가 1 이상 100 이하인가요? : " + result2);
		
		sc2.close();
	}
	
	//OR
	
	public void method3() {
		
		//사용자가 입력한 값이 'A' 또는 'a'인지 확인!
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("한 글자만 입력해주세요 > ");
		char ch;
		ch = sc3.next().charAt(0);
		
		// index : 순서 **0부터 시작
		
		// == 비교연산자는 피연산자 == 숫자
		// 단일 문자의 경우 비교연산이 가능한가? 가능하다
		// 왜? int형으로 자동형변환이 되기 때문에(int)
		
		boolean result3 = ((int)ch == 'A') || ((int)ch == 'a');
		// || : 이거나, 또는
		
		System.out.println("입력한 글자가 A 또는 a입니까?" + result3);
		
		sc3.close();
	}
	
	/*
	 * 
	 * 
	 * && : 두 개의 조건이 모두 true일 때 true
	 * 
	 * true && true : true
	 * true && false : false
	 * false && true : false
	 * false && false : false
	 * 
	 * || : 두 개의 조건 중 하나라도 true이면 true
	 * 
	 * true || true : true
	 * true || false : true
	 * false || true : true
	 * false || false : false
	 */
	
	public void method4() {
		
		int num = 10; 
		
		boolean result = false && (num>0);
		
		// Deadcode : 뒤의 비교연산 구문이 실행되지 않음
		// 오류가 나는 건 아니지만 굳이 결과값은 false일텐데 저 코드는 왜 있지??
	}
}

package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
		
	/* 
	 * 삼항연산자 : 피 연산자가 3개 => 값 3개와 연산자 1개로 이루어짐(조건식 형식으로 쓰임)
	 * 
	 * 조건식 : 결과값에 따라서 연산을 처리하는 방식
	 *        결과값이 참일 경우 첫번째 식을 처리하고,
	 *        결과값이 거짓일 경우 두번째 식을 처리하는 방식
	 *        
	 * [ 표현식]       
	 *
	 * 조건식 ? 조건이 true일 경우 결과값 : 조건이 false일 경우 결과값
	 */
	public void method1() {
		// 사용자가 입력한 값이 양수인지 아닌지 판별 후 그에 맞는 결과 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해 주세요 > ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수" : (num < 0) ? "음수" : "0이";
					// 조건식 ? 조건식이 true일 경우 결과값 : 조건식이 false일 경우 결과값
				
		System.out.println(num + "은 " + result + "다!!");
		// 10은 양수다!!
		// -7은 음수다!!
		
		sc.close();
	}
	
	public void method2() {
		// 짝수 / 홀수 판별
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
				
		//10 은(는) 짝수
		// 7 은(는) 홀수
		
		System.out.println(num + "은(는) " + result);
	}
	
	public void method3() {
		//사용자에게 영문자를 하나 입력받아서 대문자인지 아닌지 판별!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영문자를 하나 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		
		String result = ('A' <= ch && ch <= 'Z' ? "입" : "가 아닙");
		System.out.println("입력하신 글자는 대문자" + result + "니다.");
	}
	
	public void method4() {
		
		// 문자 3개를 입력받아서 다 똑같으면 똑같다!!! 하나라도 다르다면 다르다!!
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자를 입력해주세요 : ");
		char ch1 = sc.next().charAt(0);
		
		System.out.println("두 번째 문자를 입력해주세요 : ");
		char ch2 = sc.next().charAt(0);
		
		System.out.println("세 번째 문자를 입력해주세요 : ");
		char ch3 = sc.next().charAt(0);
		
		String result = (ch1 != ch2) ? "다르구먼" : (ch2 != ch3) ? "다르구먼" : "똑같구먼";
		String result2 = (ch1 != ch2 || ch2 != ch3) ? "다르구먼" : "똑같구먼";
		String result3 = (ch1 == ch2 && ch2 == ch3) ? "똑같구먼" : "다르구먼";
		
		System.out.println("자네가 쓴 문자 3개는 서로 \n" + result +"\n" + result2 + "\n" + result3);
		
		sc.close();
	}
}

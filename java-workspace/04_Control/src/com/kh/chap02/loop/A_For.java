package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method1() {
		// 여러분 대답좀 ^^....
		
		/*
		System.out.println("여러분 대답좀 ^^....");
		System.out.println("여러분 대답좀 ^^....");
		System.out.println("여러분 대답좀 ^^....");
		*/
		// 적은 횟수는 얼마든지 복붙이 가능!!
		// 1200번, 12만번
		
		for(int i = 0; i  < 120000; i++) {
			System.out.println("여러분 대답좀 ^^....");			
		}
	}
	/*
	 * for문
	 * 
	 * for(){
	 * 
	 * }
	 * 
	 * 소괄호 안에 반복을 지정하는 부분이 있고,
	 * 초기식; 조건식; 증감식 세가지로 이루어진다.
	 * ;; 각각 세미콜론으로 구분한다.
	 * 
	 * [ 표현법 ]
	 *		// 반복 횟수를 지정하는 요소들
	 * for(초기식; 조건식; 증감식){
	 * 		반복적으로 실행시키고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행"될 구문
	 * 		        반복문에서 사용할 변수를 선언하고 초기화하는 구문    =>  int i =0;
	 * 		    i는 제어변수라고 함
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 반복을 실행
	 * 			조건식이 false일 경우 반복문을 멈추고 빠져나옴    =>  i < 10;
	 * 
	 * - 증감식 : "반복문을 제어하는 변수 값"을 증감시키는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이때, 보통 증감연산자가 주로 쓰임			 =>  i++
	 * 
	 */
	
	public void method2() {
		
		// 고정된 문자열이 아닌 매 번 달라지는 출력결과를 확인해보자!
		/*
		 * 
		 * 
		 * 
		 */
		/*
		for(int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + 1);
		}
		*/
		
		// i값이 1에서부터 5와 같아질때까지 1씩 증가
		for(/* 1 */int i = 1; /* 2 */i <= 5; /* 4 */i++) {
			/* 3 */System.out.println(i + "번 반복");   //1->2->3->4->2->3->4 ~
		}
		
		// 감소하는 예
		// i값이 10에서부터 6보다 크거나 같다면 1씩 감소하면서 반복 수행
		// 10 9 8 7 6
		for(int i = 10; i >= 6; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("-------------------------");
		
		for(int i = 1; i <= 5; i +=2) {
			System.out.println("i : " + i);
		}
	}
	
	public void method3() {
		
		// *****
		// *****
		// *****
		// *****
		// *****
		
		/*
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// for문 안에 if문 쓰기!
		int count = 0;
		
		for(int i = 0; i < 30; i++) {
			// 출력형식 : X번째 반복입니다!!(시작 1부터!!)
			System.out.println((i+1) + "번째 반복입니다!!");
			count++;
			if(count % 10 == 0) System.out.print("☆\n");
		}
	}
	
	// 구구단
	// 사용자한테 단을 입력받아서
	// 구구단을 출력해보자!!
	// 메소드 이름 : gugudan()
	public void gugudan() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 단수를 입력해주세요 > ");
		int number = sc.nextInt();
		
		for(int i = 0; i < 9; i++) {
			System.out.printf("%d * %d = %d\n", number, (i+1), (number * (i+1)));
		}
	}
}
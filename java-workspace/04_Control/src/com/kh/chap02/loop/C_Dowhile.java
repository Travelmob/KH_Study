package com.kh.chap02.loop;

public class C_Dowhile {

	/*
	 * do-while문
	 * 별도의 조건검사 없이 무조건 1번은 실행!!!
	 * 조건이 맞지 않더라도 한 번은 수행
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; // 필수 X
	 * 
	 * do {
	 * 		System.out.println("한번은 해봐 ~ ");
	 * 		증감식;
	 * } while(조건식);
	 * 
	 * while(false){
	 * 
	 * }
	 * 
	 * while문은 처음 수행할 때도 조건식 검사 후 true여야만 실행
	 * do-while은 첫 실행은 별도의 조건검사 없이 무조건 한 번 실행!!!
	 * 
	 */
	
	public void method1() {
		
		// 초기식
		int num = 1;
		
		do {
			System.out.println("돌려볼래?");
			num--;
		} while(num == 0);
	}
}

package com.kh.chap02.loop;

import java.util.Arrays;

public class B_While {
	
	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; // 필수는 아님
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행할 코드; // a
	 * 		증감식; // 필수는 아님
	 * }
	 * 
	 * 괄호 안에 조건식 true일 경우 해당(a) 구문을 반복적으로 실행
	 * 
	 * => 반복의 횟수를 개발자가 명확하게 알고 있다 => for
	 * => 반복의 횟수를 개발자가 가늠할 수 없다 => while
	 * 
	 * 무한반복 => while
	 * while(true) 반복을 무조건 시킬거야!!
	 * 
	 */
	
	public void method0() {
		for(;;) {
			System.out.println("계속 돌아라 ~");
		}
	}
	
	public void method1() {
		/*
		int i = 0;
		
		while(i < 3) {
			i++;
			System.out.println(i + "번 째 반복");
		}
		*/
		
		/*
		int i = 10;
		
		while(i >= 6) {
			System.out.println(i);
			i--;
		}
		*/
		
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			i += 2;
		}
	}
	
	public void method2() {
		// 1 ~ 100까지의 짝수만 더하기
		
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			// 짝수일때만 더해주자
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println(sum);
	}
	
	public void method3() {
		
		// 1부터 랜덤한 수 ( 1 ~ 10 )까지 모두 더한 합계 출력
		// random : 무작위 => 임의난수
		// Math라는 클래스의 random()를 활용
		// random() 결과 값 : 0.0 ~ 0.9999999
		
		// [ 표현법 ]
		// Math m = new Math();     기존 방식 사용불가
		// m.random();
		// Math클래스는 따로 별칭을 지어줄 필요가 없음
		
		
		// 1단계. ramdom() 잘 돌아가나??
		double num = Math.random();
		System.out.println("무작위 수 : " + num);
		
		// 2_1단계. 결과값에 10을 곱하면??
		//			0.0 ~ 9.9999999
		// 2_2단게. int형으로 강제 형변환
		//			0 ~ 9
		// 2_3단계. +1
		//			1 ~ 10
		
		int random = (int)(Math.random() * 10) + 1;
		System.out.println("무작위 수 2 : " + random);
		
		
		// 3단게. 누적합 구하기
		// 1부터 랜덤한 수(1~10)까지 모두 더한 합게
		
		int i = 1;
		int sum = 0;
		
		while(i <= random /*1부터 10까지 중 무작위까지 */) {
			
			sum += i;
			i++;
		}
		
		System.out.println("1부터 무작위 수까지 더한 결과 : " + sum);
	}
	
	public void lotto() {
		
		// 로또 ver_0.1
		// 번호 범위 : 1 ~ 45
		// 6개 선택
		
		int[] lotto = new int[6];
		
		/*
		lotto[0] = (int)(Math.random() * 45)+1;
		lotto[1] = (int)(Math.random() * 45)+1;
		lotto[2] = (int)(Math.random() * 45)+1;
		lotto[3] = (int)(Math.random() * 45)+1;
		lotto[4] = (int)(Math.random() * 45)+1;
		lotto[5] = (int)(Math.random() * 45)+1;
		*/
		
		int i = 0;
		while(i<6) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			i++;
		}
		
		// Arrays.toString(배열이름);
		System.out.println(Arrays.toString(lotto));
		
	}
}

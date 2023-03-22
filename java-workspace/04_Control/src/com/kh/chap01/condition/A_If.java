package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 단독 if문
	 * [ 표현법 ]
	 * 
	 * if(조건식){
	 * 		조건식이 true일 경우 실행될 코드
	 * }
	 * 
	 * 
	 * => 조건식의 결과가 true일 경우 : {}(중괄호) 안의 코드들이 실행됨
	 * => 조건식의 결과가 false일 경우 : {}(중괄호) 안의 코드들을 건너뜀
	 * 
	 */
	
	public void lunchMenu() {
		
		// 영춘옥
		// 고냉지
		
		// 맑음 / 비옴
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("오늘의 날씨는 ??(맑음, 비옴) > ");
		
		String weather = sc.nextLine();
		
		String lunch = (weather.equals("맑음")) ? "영춘옥" : "고냉지";
		                //문자열 값 비교는 .equals()		
		System.out.println("오늘의 점심음 " + lunch + "입니다.");
	
	}
	
	// 삼항연산자 때 해봤던 거
	public void method1() {
		// 정수를 입력받고 양수 / 0 / 음수 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 내놔 > ");
		int num = sc.nextInt();
		
		// 만약에 사용자가 입력한 값이 0보다 크다면
		if(num > 0) {
			System.out.println(num + "은(는) 양수다!!");
		}
		
		// 만약에 사용자가 입력한 값이 0이라면
		if(num == 0) { System.out.println("0이다!!");}
		
		// 만약에 사용자가 입력한 값이 0보다 작다면
		if(num < 0) System.out.println("음수입니다.");
			
	}
	
	public void method2() {
		
		// if문을 이용해서 홀수 / 짝수 판별
		// 양수일 경우에만 조건물을 실행!!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("양수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		// 홀수 + 양수
		// 짝수 + 양수
		
		String result = "";
		
		if(num > 0) {
			result = ((num % 2) == 0) ? "짝수" : "홀수";
			System.out.println("입력하신 숫자는 " + result + "입니다");
		}
		
		// 만약에 사용자가 입력한 값이 양수이고(이면서) 사용자가 입력한 값이 짝수면
		// if          ((num  > 0)   &&        (num   % 2 == 0))
		if((num > 0) && (num % 2 == 0)) System.out.println("입력하신 숫자는 양수에 짝수입니다");
		// 만약에 사용자가 입력한 값이 양수이고(이면서) 사용자가 입력한 값이 홀수면
		// if          ((num  > 0)   &&        (num   % 2 != 0))
		if((num > 0) && (num % 2 != 0)) System.out.println("입력하신 숫자는 양수에 홀수입니다");
		
		// 중첩 if문
		// 결과는 동일
		if(num > 0) {
			if(num % 2 == 0) System.out.println("짝수");
			if(num % 2 == 1) System.out.println("홀수");
		}
	}	
	public void method3() {
		
		// 주민번호 체크
		// 주민번호를 입력받아서 성별 체크
		//                7자리 2000년도 기준 1,2,3,4
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 앞자리를 입력해주세요 : ");
		String str = sc.next();
		System.out.print("주민등록번호 뒷자리를 입력해주세요 : ");
		String str2 = sc.next();
		
		String personId = str + "-" + str2;
		
		//System.out.println(personId);
		
		// "순서가 있는 (단일)문자들의 나열"
		// "a b c d e f g"
		//  0 1 2 3 4 5 6
		// 순서는 index라고 부름 ** index는 0번부터 시작
		
		// 1 1 1 1 1 1 - 2 2 2 2 2 2 2 
		// 0 1 2 3 4 5 6 7 8 9
		
		// 입력받은 주민번호로부터 성별에 해당하는 '문자'를 추출
		// charAt(7) => 주민번호 문자열 상 8번째에 있는 7번 인덱스를 추출하겠다.
		
		char gender = personId.charAt(7);
		
		System.out.println(gender);
		
		// 1 / 3이면 남자입니다 출력
		// 2 / 4이면 여자입니다 출력
		// 넷 다 아니면 ??????? 출력
		
		if (gender == '1' || gender == '3') System.out.print("남자입니다");
		if (gender == '2' || gender == '4') System.out.print("여자입니다");
		
		// 만약에 사용자가 입력한 주민등록번호에서 8번째 문자가 넷 다 아니면
		// if(
		if (gender != '1' && gender != '2' && gender != '3' && gender != '4') {
			System.out.print("????????");
		}

	}

}

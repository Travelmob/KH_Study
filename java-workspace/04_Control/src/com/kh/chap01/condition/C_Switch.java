package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	public void method0() { // 메소드 0 영역 시작
		
		// ctrl + shift + o		: import 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 층에 가시나요? :");
		int floor = sc.nextInt();
		
		switch(floor) {
		case 1 : System.out.println("일층입니다. 문이 열립니다.");
		break;
		case 2 : System.out.println("이층입니다. 문이 열립니다.");
		break;
		case 3:  System.out.println("삼층입니다. 문이 열립니다.");
		break;
		
		}
		
		/*
		 * switch문
		 * 
		 * [ 표현식 ]
		 * 
		 * switch(아래 기술할 값들과 동등비교를 할 대상자){
		 * 		case 정수, 문자, 문자열 : 실행할 코드1;
		 * }
		 * 
		 * 			// 동등비교대상
		 * switch(정수, 문자, 문자열){
		 * 		case 값1 : 실행할 코드1; // 동등비교대상 == 값1   true일 경우 실행할 코드 1을 수행
		 *		break;				// switch영역을 빠져나간다.
		 *		case 값2 : 실행할코드2; // 동등비교대상 == 값2   true일 경우 실행할 코드 2를 수행
		 *		break;
		 *		case 값n : 실행할코드n; // 동등비교대상 == 값n 
		 *		break;
		 *		default : 실행할코드; // == else 
		 *	}
		 *
		 */
		
	}
	
	public void method1() {
		//사용자에게 값을 입력받아서 홀수/짝수 판별
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 주세요? > ");
		int num = sc.nextInt();
		
		int oddEven = num % 2; // 0 : 짝수, 1 : 홀수
		
		switch(oddEven) {
		case 0: System.out.println("짝순데??");
		break;
		case 1: System.out.println("홀순데??");  // Switch문의 마지막에는 break 적지 않음
		}
	}
	
	public void method2() {
		
		// 1. 사용자로부터 주민번호 입력받기 (String personId => xxxxxx-0xxxxxx)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요 (- 포함)");
		String personId = sc.next();
		
		// 2. 입력받은 주민번호로부터 성별에 해당하는 문자를 추출
		
		char gender = personId.charAt(7);
		
		// 3. 스위치문을 이용해서 조건문 작성
		
		String gender2;
		
		switch(gender) {
		case '1' :
		case '3' : gender2 = "남자";
		break;
		case '2' :
		case '4' : gender2 = "여자";
		break;
		default : gender2 = "외계인";
		}
		System.out.println(gender2 + "입니다.");
	}
	
	// switch
	// 쌀국수, 김밥, 순두부, 비빔밥, 도시락, 피자
	public void foodCourt() { // 롯백지하 1층
		
		// 사용자에게 구매할 음식의 이름을 입력받아
		// 각 음식마다의 가격을 출력해줄 것
		
		// 쌀국수,	김밥,		순두부,	비빔밥,	도시락,	피자
		// 12000,	5000	8000	10000	6000	12000
		
		// 나가 ~ 우리집에 없어 ~ 딴집 가 ~
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 음식을 입력해주세요(쌀국수, 김밥, 순두부, 비빔밥, 도시락, 피자) : ");
		String food = sc.nextLine();
		int cost = 0;
		
		switch(food) {
		case "쌀국수" :
		case "피자" : cost = 12000; break;
		case "비빔밥" : cost = 10000; break;
		case "순두부" : cost = 8000; break;
		case "도시락" : cost = 6000; break;
		case "김밥" : cost = 5000; break;
		default : System.out.printf("우린 %s 같은 음식은 안 팔아", food);
		return; // break는 반복문 return은 메서드를 빠져나감
				// 현재 실행되고 있는 메소드영역을 아예 빠져나간다.
				// 메소드 호출 부분으로 돌아간다~
		}
		if(cost != 0) {
			System.out.printf("%s의 가격은 %d원 입니다", food, cost);
		}
		
		}
	
	public void login() {
		
		// 로그인 기능!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String userId= sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		String id = "user01";
		String pwd = "pass01";
		String nickname = "자바개발자";
		
		if(userId.equals(id) && userPwd.equals(pwd)) {
			System.out.println("로그인 성공~!" + nickname + "님 환영합니다 ^.^");
		// 사용자가 입력한 문자열과 회원가입시 입력한 문자열이 일치하지 않는다면
		} else if(!userId.equals(id)) {
			System.out.println("아이디가 존재하지 않습니다!");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		// 기본자료형 : boolean, byte, int ,short, long, float, double, char
		// => 기본자료형 같은 경우네는 동등비교(==, !=)가 잘 됨!!!
		
		// 참조자료형 : String의 경우
		// => 동등비교(==,!=)
		// 이유? 참조자료형의  경우 실제로 변수에 담기는 값이 '주소값'이기 때문
		// 문자열의 값을 비교 : equals()를 사용한다. => true, false
		// [표현법] 문자열.equals("비교할문자열");
		
	}
}

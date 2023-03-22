package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break : break문을 만나는 순간 "가장 가까운 반복문"을 빠져나간다.
	 *         해당 break문이 속해있는 반복문 "한겹"만 빠져나감!!!!!!!
	 *         
	 * * 주의사항 : switch문 안에 break;와 다른 개념
	 * 			 switch문 내부에 있는 break 해당 switch문을 빠져나가는 용도일 뿐!!
	 * 
	 */
	
	public void method1() {
		
		// 매 번 반복해서 새롭게 랜덤값 (1~100)을 생성해서 출력 => 무한하게
		
		// 1. while(true)
		// 2. for(;;)
		
		// 반복을 하다가 생성된 임의의 정수가 홀수일 경우 반복을 중단시키고 싶은
		
		for(;;) {
			int num = (int)(Math.random()*100) + 1;
			if(num % 2 == 1) {
				System.out.println("반복 끝!");
				break;
			}
			System.out.println(num);
		}
	}
	
	public void method2() {
		
		// 매 번 사용자에게 문자열을 입력 받은 후
		// 해당 문자열의 길이를 출력해보자 ~
		// 단, 사용자가 "exit"을 입력할 경우 반복문을 빠져나가게 해줄 것
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력해주세요");
			String str = sc.nextLine();
			
			//사용자가 입력한 문자열과 "exit"이 동일하다면
			if(str.equals("exit")) {
				break;
			}
			
			System.out.println(str.length());
		}
	}
	// 매 번 사용자로부터 숫자를 입력받고
	// 만약에 해당 숫자가 음수라면"프로그램을 종료합니다. "라는 문구를 출력하고 종료
	
	public void make() {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요(음수면 종료) : ");
			int num = sc.nextInt();
		
			if(num < 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.println(num);
		}
	}
	/*
	 * 사용자로부터 한 개의 값을 입력 받아서
	 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력해보세요!
	 * 
	 * 단, 입력한 수는 1보다 크거나 같아야합니다.
	 * 
	 * 만약에 1미만의 숫자가 입력됐다면
	 * "1이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자에게 값을 입력받으세요!
	 * 
	 * ex)
	 * 
	 * 
	 */
	
	public void make2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력해주세요(조건 : 양수, 탈출: 0) : ");
			int num = sc.nextInt();
		
			if(num < 0) {
				System.out.println("1이상의 숫자를 입력해주세요");
			}
			else if(num == 0) {
				System.out.println("탈출!");
				break;
			}
			else {
				for(int i = num; num > 0; num--) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
	}
		
	public void make2_teacher() {
		
		Scanner sc = new Scanner(System.in);
		int num;
		boolean flag;
		
		do {
			System.out.println("1 이상의 숫자 >");
			num = sc.nextInt();
			flag = num < 1; // 기교 : boolean도 저장해서 사용할 수 있음
			if(flag) System.out.println("1 이상의 숫자를 입력해주세요");
		} while(flag);
		
		for(; num > 0; num--) {	// 기교 : i 없이 for문 사용하는 법
			System.out.print(num + " ");
		}
	}
	
	/*
	 * 
	 * 사용자로부터 시작 숫자와 공차를 입력받아서
	 * 일정한 값으로 숫자가 커지는 프로그램을 만들어봅시다.
	 * 단, 출력되는 숫자는 총 10개입니다.
	 * * '공차'란 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말합니다.
	 * 
	 * ex) 1, 4, 7, 10, 13, 16...
	 * 		3  3  3  3  3  3 -> 여기서 공차는 3
	 * 
	 */
	
	public void make3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		System.out.println("공차를 입력해주세요 : ");
		int gongcha = sc.nextInt();
			
		for(int i = 10; i > 0; i--) {
			System.out.print(num + " ");
			num += gongcha;
		}
	}
}

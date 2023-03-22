package com.kh.chap03.escape;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {
	
	/*
	 * 
	 * continue : 반복문 안에서 쓰이는 구문!
	 * 
	 * continue를 만나면 그 뒤에 어떤 구문이 있든간에 실행하지 않고 pass
	 * 가장 가까운 반복문으로 올라가라는 것을 의미
	 * 
	 */
	
	public void method1() {
		
		// 반복문을 1씩 증가시키면서 반복하는데, 홀 수 일 경우만 출력하도록
		// if(i % 2 == 1) System.out.pirntln(i);
		
		// for(int i = 1; i <= 10; i+=2)
		
		for(int i = 1; i<=10; i++) {
			//1부터 10까지 홀수만 출력
			
			if(i % 2 == 0) {
				continue;
			}
				
			System.out.print(i+" ");
		}
	}
	
	public void method2() {
		// 1부터 100까지의 총 합계를 구해서 출력!!
		// 단 7의 배수값만 빼고 더해봅시다.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;
		int count = 0;
		
		for(int i = 0; i < 100; i++) {
			if((i+1) % 7 == 0) {
				System.out.print("□");
				count++;
				if(count % 10 == 0) {System.out.println(" ");}
				sum2 += (i + 1);
				continue;
			}
			System.out.print("■");
			count++;
			if(count % 10 == 0) {System.out.println(" ");}
			sum += (i + 1);
			
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	public void method3() {
		// 3칸짜리 정수형 배열을 만들고 숫자 입력받기
		// int[] arr = new int[3];
		// 1 ~ 100까지의 숫자만 입력받기
		// 만약에 범위를 넘어선 숫자를 입력한다면 "다시 입력하세요 !"라고 출력한 뒤 다시 입력받기!
		
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("숫자를 입력해주세요 >");
			int temp = sc.nextInt();
			
			// 사용자가 입력한 값이 1부터 100사이의 값이 아니라면
			// 	기교 : !(1 <= temp && temp <= 100) 
			//		   temp <= 0 || 100 < temp
			if(temp < 1 || temp > 100) {
				System.out.println("다시 입력해주세요 !");
				i--; // 기교 : i를 감소시켜서 증감식이 적용 안되게 함
				continue;
			}
		
	
			
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

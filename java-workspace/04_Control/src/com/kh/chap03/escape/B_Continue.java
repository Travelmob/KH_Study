package com.kh.chap03.escape;

import java.util.Arrays;
import java.util.Scanner;

public class B_Continue {
	
	/*
	 * 
	 * continue : �ݺ��� �ȿ��� ���̴� ����!
	 * 
	 * continue�� ������ �� �ڿ� � ������ �ֵ簣�� �������� �ʰ� pass
	 * ���� ����� �ݺ������� �ö󰡶�� ���� �ǹ�
	 * 
	 */
	
	public void method1() {
		
		// �ݺ����� 1�� ������Ű�鼭 �ݺ��ϴµ�, Ȧ �� �� ��츸 ����ϵ���
		// if(i % 2 == 1) System.out.pirntln(i);
		
		// for(int i = 1; i <= 10; i+=2)
		
		for(int i = 1; i<=10; i++) {
			//1���� 10���� Ȧ���� ���
			
			if(i % 2 == 0) {
				continue;
			}
				
			System.out.print(i+" ");
		}
	}
	
	public void method2() {
		// 1���� 100������ �� �հ踦 ���ؼ� ���!!
		// �� 7�� ������� ���� ���غ��ô�.
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int sum2 = 0;
		int count = 0;
		
		for(int i = 0; i < 100; i++) {
			if((i+1) % 7 == 0) {
				System.out.print("��");
				count++;
				if(count % 10 == 0) {System.out.println(" ");}
				sum2 += (i + 1);
				continue;
			}
			System.out.print("��");
			count++;
			if(count % 10 == 0) {System.out.println(" ");}
			sum += (i + 1);
			
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
	
	public void method3() {
		// 3ĭ¥�� ������ �迭�� ����� ���� �Է¹ޱ�
		// int[] arr = new int[3];
		// 1 ~ 100������ ���ڸ� �Է¹ޱ�
		// ���࿡ ������ �Ѿ ���ڸ� �Է��Ѵٸ� "�ٽ� �Է��ϼ��� !"��� ����� �� �ٽ� �Է¹ޱ�!
		
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("���ڸ� �Է����ּ��� >");
			int temp = sc.nextInt();
			
			// ����ڰ� �Է��� ���� 1���� 100������ ���� �ƴ϶��
			// 	�ⱳ : !(1 <= temp && temp <= 100) 
			//		   temp <= 0 || 100 < temp
			if(temp < 1 || temp > 100) {
				System.out.println("�ٽ� �Է����ּ��� !");
				i--; // �ⱳ : i�� ���ҽ��Ѽ� �������� ���� �ȵǰ� ��
				continue;
			}
		
	
			
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

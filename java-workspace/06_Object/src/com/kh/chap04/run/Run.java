package com.kh.chap04.run;

import com.kh.chap04.model.vo.FieldTest1;
import com.kh.chap04.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		
		//  ------------------ 1. FieldTest1 ----------------
		/*
		FieldTest1 f1 = new FieldTest1();
		// 1. stack 영역에 f1이라는 지역변수 생성
		// 객체 생성 시 (new 키워드를 만났을 때) global 멤버변수 할당!
		System.out.println(f1.global);
		f1.testVariable(8);
		// testVariable 호출 시! num, local 지역변수 할당!(stack)
		// testVariable 호출 종료 시! num, local 지역변수 소멸!
		System.out.println(f1.global);
		f1 = null; // global 사용 불가능
		System.out.println(f1.global);
		*/
		// -------------------- 3. FieldTest3 ---------------
		
		System.out.println(FieldTest3.str); // 객체를 생성하지 않아도 프로그램 실행 중이면 접근 가능
		
		FieldTest3 f3 = new FieldTest3();
		
		System.out.println(FieldTest3.str);
		System.out.println(FieldTest3.NUM);
		
		//FieldTest3.NUM = 33; 선언 불가
		
		System.out.println(f3.str);
		System.out.println(f3.str2);
		
		
		
	}

}

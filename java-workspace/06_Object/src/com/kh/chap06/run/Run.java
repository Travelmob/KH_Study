package com.kh.chap06.run;

import com.kh.chap06.controller.MethodController1;
import com.kh.chap06.controller.MethodController2;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		
		MethodController1 mc1 = new MethodController1();
		
		/*
		mc1.method1();
		System.out.println(mc1.method2());
		String na = mc1.method2();
		System.out.println(na);
		*/
		
		//mc1.method3();
		//System.out.println(mc1.method3());
		//mc1.method4(1, 10);
		//mc1.method5(5);
		
		//mc1.abc(new MethodController1());
		//mc1.abc(mc1); // 얕은복사
		//mc1.abc(2.34);
		
		/*
		OverloadingController oc = new OverloadingController();
		
		oc.test();
		oc.test(1);
		oc.test("글자", 1);
		oc.test(1,"글자");
		oc.test(1, 2);
		oc.test(1, 2,"글자");
		*/
		
		// static : 객체를 생성하지 않아도 사용 가능
		// Math.random();
		// [ 표현법 ] 풀클래스경로.메소드식별자();
		
		// Math는 풀클래스 경로 java.util.Scanner는 풀클래스 경로 미리 import 해줄 수 있음
		
		MethodController2.method2();
		String str = MethodController2.method2();
		System.out.println(MethodController2.method2());
		MethodController2.method3("이름");
		System.out.println(MethodController2.method4("홍길동"));
	}

}

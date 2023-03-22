package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		
		// 1. 기본생성자를 사용해서 객체를 생성
		User user = new User();
		
		// 2. 객체 생성과 동시에 필드값을 초기화
		// 아이디, 비번, 이름
		User user02 = new User("user01", "pass01", "유저01");
		System.out.println(user02.information());
		
		// 3. 생성자로 모든 필드 초기화!
		User user03 = new User("user02", "pass02", "유저02", 10);
		System.out.println(user03.information());

	}

}

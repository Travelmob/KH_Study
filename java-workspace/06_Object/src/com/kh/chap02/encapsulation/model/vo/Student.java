package com.kh.chap02.encapsulation.model.vo;

// 필드부, 생성자부, 메소드부

public class Student {
	
	// 필드부
	/*
	 * 정보를 담는 부분
	 * 
	 * 필드 == 멤버변수    == 클래스변수 == 인스턴수변수
	 * 
	 * 접근제한자 자료형 필드명;
	 */
	private String name;
	private char gender;
	private int age;
	
	// 생성자부
	
	// 메소드부
	/*
	 * 기능을 구현하는 부분 (method)
	 * 
	 * 접근제한자 반환형 메소드식별자(매개변수) {
	 * 			메소드 호출 시 실행할 코드;
	 * }
	 * 
	 * 접근제한자 : 호출할 수 있는 범위를 제한해준다.
	 * 반환형 : 메소드의 결과값의 자료형을 지정해준다. || void -> 돌려줄 값이 없다.
	 * 매개변수 : 메소드 호출 시 입력값을 받아주는 변수. 해당 메소드 범위에서만 사용이 가능하다. 생략 가능
	 * == 멤버함수
	 * 
	 */
	
	// 데이터를 기록 및 수정하는 기능의 메소드 : setter 메소드
	
	/*
	 * 규칙
	 * 
	 * 1. setter메소드는 접근 가능하도록 만들어야 하기 때문에 public 접근제한자를 이용
	 * 2. set필드명으로 이름 짓되 낙타봉표기법(camelCase)을 지키도록 한다!!!!!
	 * 		ex) setName(), setAge(), setGender()
	 * 3. 모든 필드에 대해서 전부 다 작성을 해줘야한다 반드시!!!!!!!!!!!!!!!!!! (웹개발환경)
	 * 
	 */
	
	//이름을 기록 및 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
		// 특정 영역 안에서는 해당 영역 안에 있는 지역변수 우선권이 있음!
		// this. 를 붙이지 않으면 매개변수 name = 매개변수 name 이렇게 인식함!
	}
	
	// 나이를 기록 및 수정할 수 있는 메소드
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이를??");
		} else {
			this.age = age;
		}
		
	}
	
	// 성별을 기록 및 수정할 수 있는 메소드
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 데이터를 반환해주는 기능의 메소드 : getter()
	
	/*
	 * 1. getter()는 접근제한자 public을 사용한다.
	 * 2. get필드명으로 짓되, 낙타봉표기법(camelCase)를 사용한다.
	 * 		ex)getName(), getAge(), getGender()
	 * 3. 모든 필드에 대해서 다 작성해줘야한다!!!!!!!!!!!!!!!!!(웹개발 한정)
	 */
	
	// 이름을 반환해주는 메소드
	public String getName() {
		// 나를 부른곳으로 name필드값을 넘겨주고 싶어.
		return name;
		// return 결과값; => 결과값을 나를 부른곳으로 돌려주겠다!!!
		// 메소드의 반환형과 반환값의 자료형이 동일한지 확인해야 함!
	}
	
	// 나이를 반환해주는 메소드
	public int getAge() {
		return age;
	}
	
	// 성별을 반환해주는 메소드
	public char getGender() {
		return gender;
	}
	
	// getter와 setter 메소드 다 만들었으면 캡슐화 끝!!
	
	// 예쁘게 메소드!
	public String information() {
		
		// 결과값은 return당 한 개!
		//String info = name + "님의 나이는 " + age + "살이고 성별은 " + gender + "입니다.";
		//return info;
		return name + "님의 나이는 " + age + "살이고 성별은 " + gender + "입니다.";
	}
}

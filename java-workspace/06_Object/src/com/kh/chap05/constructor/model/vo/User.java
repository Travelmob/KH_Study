package com.kh.chap05.constructor.model.vo;

public class User {
	
	// [ 필드부 ]
	// 회원아이디, 비밀번호, 이름, 나이
	private String userId;
	private String password;
	private String name;
	private int age;
	
	// [ 생성자부 ]
	/*
	 * 생성자(Constructor) : 식별자가 클래스식별자와 동일하고 반환형이 없는 메소드
	 * 
	 * 참고 ) 메소드
	 * 접근제한자 반환형 메소드이름(매개변수(생략가능)){
	 * 
	 * }
	 * 
	 * [ 표현법 ]
	 * public 클래스이름(매개변수(생략가능)){
	 * 		해당 생성자를 통해서 객체 생성 시 실행하고자 하는 코드;
	 * }
	 * 
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위해서
	 * 2. 객체를 생성 뿐만 아니라 유효성 있는 객체를 만들기 위해서
	 * 
	 * 생성자의 종류
	 * 1. 매개변수가 없는 생성자 => 기본생성자
	 * 2. 매개변수가 있는 생성자
	 * -> 차이점 : 필드에 값을 초기화 할 수 있느냐 없느냐 차이
	 * 
	 * 생성자 작성 시 주의사항!!
	 * 
	 * 1. 반드시!!!!!!! 생성자의 이름은 클래스의 이름과 동일해야한다!!(대/소문자)
	 * 2. 반환형은 존재하지 않는다.(메소드와 유사하게 생겨서 헷갈릴 수 있음)
	 * 3. 생성자를 여러 개 생성이 가능하지만 매개변수가 중복되어선 안됨!! => 오버로딩
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 안만들어 줌!!!
	 * 
	 * 
	 * => 기본생성자를 만드는 습관을 꼭 들이는 게 좋음
	 * 
	 */
	
	//public User() { // 특별한 이유가 없이는 객체를 만들어야해서 public 사용
		// 기본생성자(매개변수가 없다)
		/*
		 * 단지 객체를 생성할 목적으로 사용! => heap 영역에 할당할 때 공간을 확보할 때!
		 * 기본생성자는 생략해도 오류가 나지 않음!!
		 * 생성자를 하나도 안만들면 JVM이 기본생성자를 자동을 만들어줌!
		 * -> 기본생성자는 "항상" 작성해야 한다.
		 */
		//System.out.println("회원가입 성공!");
	//}
	
	public User() {} // 이거 무조건 꼭 만들기!!!!!!!!!!!!!!!!!!!
	
	// 매개변수 있는 생성자
	public User(String userId, String password, String name){
		this.userId = userId;
		this.password = password;
		this.name = name;
	}
	
	// 모든 필드를 매개변수로 갖는 생성자
	public User(String userId, String password, String name, int age) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// [ 메소드부 ]
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String information() {
		return "회원아이디는 " + userId + ", 비밀번호는 " + password + ", 이름은 " + name + ", 나이는 " + age + "입니다.";
	}

}
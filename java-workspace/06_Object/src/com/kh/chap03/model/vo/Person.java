package com.kh.chap03.model.vo;

public class Person {
	
	// 사람의 인적 정보
	// 이름, 나이, 성별, 주민번호, 핸드폰 번호, 이메일주소
	
	// [필드부]
	
	private String name;
	private int age;
	private char gender;
	private String personId;
	private String phone;
	private String email;
	
	// [메소드부]
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPersonid(String personId) {
		this.personId = personId;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPersonid() {
		return personId;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "이름 : " + name + " 나이 : " + age + " 성별 : " + gender +
				" 주민번호 : " + personId + " 전화번호 : " + phone +
				" 이메일 : " + email;
	}

}

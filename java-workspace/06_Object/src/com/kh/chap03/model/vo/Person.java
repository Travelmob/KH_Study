package com.kh.chap03.model.vo;

public class Person {
	
	// ����� ���� ����
	// �̸�, ����, ����, �ֹι�ȣ, �ڵ��� ��ȣ, �̸����ּ�
	
	// [�ʵ��]
	
	private String name;
	private int age;
	private char gender;
	private String personId;
	private String phone;
	private String email;
	
	// [�޼ҵ��]
	
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
		return "�̸� : " + name + " ���� : " + age + " ���� : " + gender +
				" �ֹι�ȣ : " + personId + " ��ȭ��ȣ : " + phone +
				" �̸��� : " + email;
	}

}

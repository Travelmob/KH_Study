package com.kh.chap05.constructor.model.vo;

public class User {
	
	// [ �ʵ�� ]
	// ȸ�����̵�, ��й�ȣ, �̸�, ����
	private String userId;
	private String password;
	private String name;
	private int age;
	
	// [ �����ں� ]
	/*
	 * ������(Constructor) : �ĺ��ڰ� Ŭ�����ĺ��ڿ� �����ϰ� ��ȯ���� ���� �޼ҵ�
	 * 
	 * ���� ) �޼ҵ�
	 * ���������� ��ȯ�� �޼ҵ��̸�(�Ű�����(��������)){
	 * 
	 * }
	 * 
	 * [ ǥ���� ]
	 * public Ŭ�����̸�(�Ű�����(��������)){
	 * 		�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * 
	 * 
	 * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���ؼ�
	 * 2. ��ü�� ���� �Ӹ� �ƴ϶� ��ȿ�� �ִ� ��ü�� ����� ���ؼ�
	 * 
	 * �������� ����
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �ִ� ������
	 * -> ������ : �ʵ忡 ���� �ʱ�ȭ �� �� �ִ��� ������ ����
	 * 
	 * ������ �ۼ� �� ���ǻ���!!
	 * 
	 * 1. �ݵ��!!!!!!! �������� �̸��� Ŭ������ �̸��� �����ؾ��Ѵ�!!(��/�ҹ���)
	 * 2. ��ȯ���� �������� �ʴ´�.(�޼ҵ�� �����ϰ� ���ܼ� �򰥸� �� ����)
	 * 3. �����ڸ� ���� �� ������ ���������� �Ű������� �ߺ��Ǿ �ȵ�!! => �����ε�
	 * 4. �Ű����� �����ڸ� ��������� �ۼ��ϰ� �Ǹ� �⺻�����ڸ� JVM�� �ȸ���� ��!!!
	 * 
	 * 
	 * => �⺻�����ڸ� ����� ������ �� ���̴� �� ����
	 * 
	 */
	
	//public User() { // Ư���� ������ ���̴� ��ü�� �������ؼ� public ���
		// �⺻������(�Ű������� ����)
		/*
		 * ���� ��ü�� ������ �������� ���! => heap ������ �Ҵ��� �� ������ Ȯ���� ��!
		 * �⺻�����ڴ� �����ص� ������ ���� ����!!
		 * �����ڸ� �ϳ��� �ȸ���� JVM�� �⺻�����ڸ� �ڵ��� �������!
		 * -> �⺻�����ڴ� "�׻�" �ۼ��ؾ� �Ѵ�.
		 */
		//System.out.println("ȸ������ ����!");
	//}
	
	public User() {} // �̰� ������ �� �����!!!!!!!!!!!!!!!!!!!
	
	// �Ű����� �ִ� ������
	public User(String userId, String password, String name){
		this.userId = userId;
		this.password = password;
		this.name = name;
	}
	
	// ��� �ʵ带 �Ű������� ���� ������
	public User(String userId, String password, String name, int age) {
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.age = age;
	}
	
	// [ �޼ҵ�� ]
	
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
		return "ȸ�����̵�� " + userId + ", ��й�ȣ�� " + password + ", �̸��� " + name + ", ���̴� " + age + "�Դϴ�.";
	}

}
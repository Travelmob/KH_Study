package com.kh.chap06.controller;

public class OverloadingController {
	
	/*
	 * �޼ҵ� �����ε�
	 * 
	 * - �� Ŭ���� �ȿ� ���� �޼ҵ������ ���� �޼ҵ���� ������ �� �ִ� ���!
	 * - �Ű����� �ڷ����� ����, ����, ���� �� �ٸ��� �ۼ��ؾ� ��
	 * - �� �Ű�������, ����������, ��ȯ���� �޼ҵ� �����ε��� ������ ��ġ�� ����.
	 *
	 */
	
	//�޼ҵ���� test�� ����
	public void test() {
		System.out.println("��¼����¼��"); // scout -> ctrl + space
		System.out.println("1���޼ҵ�");
	}
	
	public void test(int a) {
		System.out.println("�ȳ� ���� ��Ʈ a��");
	}
	
	public void test(int a, String s) {
		System.out.println("�ȳ� ���� ��Ʈ a ��Ʈ�� s��");
	}
	
	public void test(String s, int a) {
		System.out.println("�ȳ� ���� ��Ʈ�� s ��Ʈ a��");
	}
	
	public void test(int a, int b) {
		System.out.println("�ȳ� ���� ��Ʈ �ΰ���");
	}
	
	/*
	public void test(int c, int d) {
		System.out.println("�ȳ� ���� ��Ʈ �ΰ���");
	}
	- ������ �� ���� �޴� test�� �ϳ� �� ����ٸ�??
	     �Ű������� �̸����� ������� �ڷ����� ����, ������ ���� ������ ������ �߻�!!
	     �� �Ű����� �ڷ����� ������ ������ �׻� �ٸ��� �ۼ��ؾ߸��Ѵ�!!
	*/
	
	public void test(int a, int b, String s) {
		System.out.println("���ñ⹹�ñ�");
	}
	
	/*
	public int test(int a, int b, String s) {
		return 123;
	}
	- ��ȯ���� �ٸ��ٰ� �����ε��� ������� ����
	     �޼ҵ� ȣ���ϴ� �������� �Ű������� �����ϸ� ������ ������ �߻�
	     ��ȯ���� ������� �Ű������� ������ ������ �ٸ��� �ۼ��Ǿ���Ѵ�.
	*/
	/*
	private void test(int a, int b, String s) {
		System.out.println("���� �����");
	}
	- ���� �����ڰ� �ٸ��ٰ� �����ε��� ������� ����
	     ���������ڿʹ� ������� �Ű����� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ���Ѵ�~
	*/

}

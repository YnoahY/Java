package index02.sec04.verify;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //new�� scanner ��ü ������ ���� ����
		
		System.out.println("[ �ʼ� ���� �Է� ]"); //()���� ���� ���
		
		System.out.print("1. �̸�: "); //()���� ���� ���
		String name = scanner.nextLine(); //���� ������ �Էµ� ���ڿ� ����
		
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String num = scanner.nextLine(); 
		
		System.out.print("3. ��ȭ��ȣ: ");
		String tel = scanner.nextLine();
		
		System.out.println();
		
		//���� ���� �Է� �ϸ� �Ʒ� ���� �ѹ��� ��� ��
		System.out.println("[ �Էµ� ���� ]");
		System.out.println("1. �̸�: " + name);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: " + num);
		System.out.println("3. ��ȭ��ȣ: " + tel);
	}

}

/*�⺻Ÿ���� �� �񱳿� ���ڿ� ��
 * �⺻Ÿ�� ��: == _ ��ü�� �ּ� ��
 * ���ڿ� ��: equals()�޼ҵ�_ ��ü�� �ּҰ��� �ƴ� "������ ��"�� ��*/

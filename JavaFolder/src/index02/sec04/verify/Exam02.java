package index02.sec04.verify;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		//���� ����
		
		Scanner scanner = new Scanner(System.in); 
		//scanner ���� ���� = new�� scanner����(�ý����� �Է� ��ġ�� ���� �д�)
		//��ĳ�� ���� �Ϸ�
		
		System.out.print("ù��° ��: "); //console�� ����� ����:"ù��° ��: "
		String strNum1 = scanner.nextLine(); //string ���� ���� = enterŰ �������� �Էµ� ���ڿ� ����
		//Ű����� �Է�
		
		System.out.print("�ι�° ��: "); //console�� ����� ����:"�ι�° ��: "
		String strNum2 = scanner.nextLine(); //string ���� ����(string���� ����) = enterŰ �������� �Էµ� ���ڿ� ����
		//Ű����� �Է�
		
		int num1 = Integer.parseInt(strNum1); //string���� strNum1�� int�� ����
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ���: " + result);
		

	}

}

/*nextLine() �޼ҵ�
 * ����Ű ġ�� ������ �Է��� �� �о� ����
 * ���ڿ��� ��ȯ*/
package index02.sec04;

import java.util.*;

public class Exam05_ScannerExample {

	public static void main(String[] args) throws Exception{
		//�Էµ� "���ڿ�" ��� �� q�� ���� ������ ���� ����, !keycod�ƴ�!
		Scanner scanner = new Scanner(System.in); //new�� system.in���� Scannerȣ�� �� Scanner���� scanner ������ ��ü ����
		String inputData; //string���� ���� ����
		
		while(true) { //���� ��
			inputData = scanner.nextLine(); // ����Ű ġ�� ������ �Է��� �� �о� ����
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			if(inputData.equals("q")) { //.equals(): .���� �������� ()���� �ɷ°��� �����Ҷ� true�� ��ȯ
				break; //���� ����� �ݺ����� ���������� �����

			}
		}
		System.out.println("����");

	}

}

/*nextLine() �޼ҵ�
 * ����Ű ġ�� ������ �Է��� �� �о� ����
 * ���ڿ��� ��ȯ*/
package index04.sec01;

public class Exma7_SwitchCharExample {

	public static void main(String[] args) {
		//char�� case�� 
		/*case ���� ��츦 �ϳ��� ���� ��� ����*/
		char grade = '8';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("���ȸ��");
		case 'B':
		case 'b':
			System.out.println("�Ϲ�ȸ��");
		default:
			System.out.println("�մ�");
		}

	}

}


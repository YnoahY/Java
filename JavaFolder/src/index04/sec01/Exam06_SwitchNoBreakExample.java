package index04.sec01;

public class Exam06_SwitchNoBreakExample {

	public static void main(String[] args) {
		/*8 <= ���� < 12: 4+8 ������ ���� ���
		 * 0.9 * 4 = 3.6 + 8 = 11
		 * 0~11 ������ �� �����ϰ� ���*/
		int time = (int)(Math.random()*4) + 8;
		System.out.println("����ð�: " + time + " ��");
		
		switch(time) {
		case 8:
			System.out.println("���");
		case 9:
			System.out.println("ȸ��");
		case 10: 
			System.out.println("����");
		default :
			System.out.println("�ܱ�");
		}

	}

}



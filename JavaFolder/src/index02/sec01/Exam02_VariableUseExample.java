package index02.sec01;

public class Exam02_VariableUseExample {

	public static void main(String[] args) {

		
		
		// ������� : ���� ���� �̿�, ��¹�& ����� ����
		int hour = 7;
		int minute = 27;
		
		/* +: ���������, ���Ῥ����, �������� ��Ÿ���� ��ǥ���� ��ȣ
		 * ���� ����� ���Ῥ���ڷ� �̿�
		 */
		System.out.println(hour + "�ð�" + minute + "��"); //��¹� ����
		

		// (): �н������ڰ� �ƴ� �� ������ �켱������ ��Ÿ��
		int totalMinute = (hour*60) + minute;
		System.out.println("�c" + totalMinute + "��"); //����� ����

	}

}

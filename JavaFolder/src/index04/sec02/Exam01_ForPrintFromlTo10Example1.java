package index04.sec02;

public class Exam01_ForPrintFromlTo10Example1 {

	public static void main(String[] args) {
		//1~10���� ����		
		int sum = 0; //�հ踦 ������ �� ���� ����

		int i =0; //(i-1)�κж����� ��������
		for(i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "������ ��: " + sum);

	}

}

/* ("1~" + (i-1) + "��: " + sum);
 * (i-1): for������ ������ ���ǿϷ��� 10���� �Ǵ°��� �ƴ϶�
          10�� ������ 11ȸ�� ���ට ���ǽ��� false�� �Ǿ� ���� ���� �ǹǷ� -1ó�� ���־�� ��.*/



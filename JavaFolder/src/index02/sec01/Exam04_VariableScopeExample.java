package index02.sec01;

public class Exam04_VariableScopeExample {

	public static void main(String[] args) {
		
		/*���� ���� : 
		 * �߰�ȣ�� ���� �޼ҵ� ��� ���� ����� ����
		 * �޼ҵ� ��� �������� ��� �ǰ� �޼ҵ� ���� ���� �� �ڵ� ���� �� �ش� ��� �������� ��� ����
		 * ���θ޼ҵ� �ȿ��� ������ ������ �� ���� ��Ͽ����� ��� ����
		 */
		int v1 = 12;
		
		if(v1>10) {
			int v2;
			v2 = v1 - 5;
		} //if ���
		
		int v3 = v1 + 7 -5;	
		
		System.out.println(v3);

	}

}


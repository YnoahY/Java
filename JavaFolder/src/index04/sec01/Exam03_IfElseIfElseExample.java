package index04.sec01;

public class Exam03_IfElseIfElseExample {

	public static void main(String[] args) {
		/* if else if else�� : ���ǽ��� ������
		 * ó�� if���� ���ǽ��� false�� ��� �ٸ� ���ǽ��� ����� ���� ���� ��� ����
		 * if(l)�� false �� else if(2)���� ����� �� ����
		 * ù if�������� true�� {}�� ����, false�� ���� else if�������� ���� ����� �� if�� {}����, false�� else��
		 
		 * ���ڰ��� if���� ���ǿ� ������ {}���� ���� ���� 
		 * if(){} else if(){} else{}
		 * else���� ���� �ʿ�x ���� �ش��ϴ� ������ �ƴ� ���� else�� ���� */
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("����: 100~90");
			System.out.println("���: A");
		} else if(score>=80) {
			System.out.println("����: 80~89");
			System.out.println("���: B");	
		} else if(score>=70) {
			System.out.println("����: 70~79");
			System.out.println("���: c");
		} else { 
			System.out.println("����: 60����");
			System.out.println("���: D");
		}

	}

}

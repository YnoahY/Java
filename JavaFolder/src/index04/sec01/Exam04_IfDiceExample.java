package index04.sec01;

public class Exam04_IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		if(num==1 ) {
			System.out.println(1);
		} else if(num==2 ) {
			System.out.println(2);
		} else if(num==3 ) {
			System.out.println(3);
		} else if(num==4 ) {
			System.out.println(4);
		} else if(num==5 ) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

	}

}

/*Math.random()�޼ҵ� 

 * Math.random()*�ִ밪
 * Math.random()*(�ִ밪-�ּҰ�) + �ּҰ�
 
 * ������
 * 0.0 <= Math.random() <1.0
 
 *(int)(Math.random()*6) 
  0.0 * 6 = 0 
  0.1 * 6 = 0.6 
  0.2 * 6 = 1.2 
  . 
  . 
  . 
  0.9 * 6 = 5.4 (int�� ���� ����ȯ �� 5�� ���� ����)
 
 * (int)(Math.random()*6) + 1;
   5.4���� 5 �� 5 +1 =6 // ������ 6
 */
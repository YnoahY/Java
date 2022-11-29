package index02.sec02;

public class Exam01_InterLiteralExample {

	public static void main(String[] args) {
		/*�ڹ� ��� �⺻Ÿ��
		 * ����: byte(1byte), short(2byte), int(4byte/�⺻), long(8byte)
		 * �Ǽ�: float(�Ҽ�������6�ڸ�), double(�Ҽ������� 15�ڸ�/�⺻)
		 * ��:boolean(��,����/1,0)
		 * ����: char(2byte, ���� ���)
		 */

		
		//**����Ÿ��**
		
		
		//���ͷ�: �ҽ��ڵ忡�� ���α׷��Ӱ� ���� �Է� �� ��
		 
		/* ������ �ν�
		 * 2����: 0b, 0B�� ����/ 0�� 1�� ����
		 * 8����: 0���� ����/ 0~7�� ����, 8�ڸ��϶� �ø�
		 * 10����: �Ҽ��� ���� 0~9�� ����, �ΰ�����ȭ, 10�� �Ǹ� �ڸ��ø�
		 * 16����: 0x, 0X�� ����/ 0~9�� (10~16���)A~F, a~f�� ����, 16�ڸ��϶� �ø�
		 */
		
		int var1 = 0b1011; //2����
		int var2 = 0206; //8����
		int var3 = 365; //10����
		int var4 = 0xB3; //16����
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
		

	}

}

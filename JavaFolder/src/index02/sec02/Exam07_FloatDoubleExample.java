package index02.sec02;

public class Exam07_FloatDoubleExample {

	public static void main(String[] args) {
		/*�Ǽ�Ÿ��: float, double
		 * �Ҽ����� �ִ� ���ͷ��� 10���� �Ǽ��� �ν�
		 * e,E ���Ե� ���� ���ͷ��� ���� �� ������ ǥ����, �Ҽ��� �ִ� 10��� �Ǽ��� �ν�
		 * �ڹٴ� double�� �⺻ Ÿ������ �ؼ�
		 *  *�Ǽ��� ���̻� ������ �߿�*
		 */
		
		/*flot
		 * ������ 2�����ε� ��
		 * 10������ ȯ���ؼ� �Ҽ� 6~9�ڸ����� �����ϳ� �ȵǴ� ��� ����.
		 * 6�ڸ��� �����ؾ���. 6�ڸ� �̻��� double�� ���
		 */
		
		
		double var1 = 3.14; //float ���� �� ������ ����(type mismatch)		
		float var2 = 3.14f; //���ͷ� �� f,F �ٿ� floatŸ�� ǥ��
		double var3= 3.14; //doubleŸ���� floatŸ�� ���� 2�谡�� ���е��� ���� �� ��Ȯ�� ������ ���� ����
		
		//���е� �׽�Ʈ
		float var4 = 0.1234567890123456789f; /*7�ڸ����� �ݿø���, 
		                                       15�ڸ� �̻�Ǵ� �����͸� ���� ���� ������ ���� ����, �׷��� ���̻�f�� ���� ���ڶ�°� ǥ��*/
		double var5 = 0.1234567890123456789; //15�ڸ� ������ ����, �� �̻�� ���ڰ� 5�̻��̸� �ø� �ƴϸ� ����
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e����ϱ�
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		

	}

}

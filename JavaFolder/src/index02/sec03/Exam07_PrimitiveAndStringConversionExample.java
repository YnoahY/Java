package index02.sec03;

public class Exam07_PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		/* String(���ڿ�) �� �⺻Ÿ������ ���� Ÿ�Ժ�ȯ
		 ** �⺻������ ���� ������ ��: ����� ������ ���ڿ��� ��ȯ ����**

		 * String(Ŭ����) str(��������) = x;
		 * byte value = byte Byte.parseByte(str);
		 * short value = Short.parseShort(str);
		 * int value = Integer.parseInt(str);
		 * long value = Long.parseLong(str);
		 * float vlaue = Float.parseFloat(str);
		 * double value = Double.parseDouble(str);
		 * boolean value = Boolean.parseBoolean(str);
		 */


		//���ڿ� �� �⺻Ÿ��
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		/* ���ڿ��� ���� �� ��� ���Խ�, ���� Ÿ�� ��ȯ �õ��� ��� �������� ���� �߻�: NumFormatException
		 * String.valueOf() �޼ҵ�: �⺻Ÿ�� �� ���ڿ��� ��ȯ
		 * String(��Class).valueOf(��޼ҵ�)*/
		
		//�⺻Ÿ�� �� ���ڿ�
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);


	}

}


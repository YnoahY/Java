package index04.sec02;

public class Exam05_ForPrintFromlTo10Example {

	public static void main(String[] args) {
		//������
		for (int i=2; i<=9; i++) {
			System.out.println("[ " + i + "�� ]");
			for (int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}

	}

}

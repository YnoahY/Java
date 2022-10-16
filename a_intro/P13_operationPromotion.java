package a_intro;

public class P13_operationPromotion {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		double result = (double) x/y; //double로 형변환 한 x,y
		System.out.println(result);
		
		int e = 1;
		int f = 2;
		double result1 = e/(double)f; //int e를 double로 형변환 된 f로 나누기
		System.out.println(result1);
		
		int a = 1;
		int b = 2;
		double result2 = (double) a / (double) b;
		System.out.println(result2);
	}

}

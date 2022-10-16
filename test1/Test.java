package test1;

public class Test {

	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3           "; //string -> double 먼저 변환
		int result = (int)(var1 + var2) + (int)(var3 + Double.parseDouble(var4));
		System.out.println(result);

	}

}

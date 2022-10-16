package a_intro;

public class P03_int {

	public static void main(String[] args) {
		//b: byte - 2진수
		/* 진수 : 값이 올라갈 때를 의미 */
		int var1 = 0b1011; 	//~1
		int var2 = 0206; 	//~7
		int var3 = 365; 	//~9
		int var4 = 0xB3; 	//~9,A~F(a~f)
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);

		/* 2진수
		 * 0b1011
		 * 2^3 , 2^2 , 2^1 , 2^0
		 *2진수를 10진수 : 8*1 + 4*0 + 2*1 + 1*1 = 11
		 *8진수를 10진수 : (8^2)64*2 + (8^1)8*0 + (8^0)0*6
		 *16진수를 10진수 : (16^1)*11 + (16^0)*3 = 176 + 3 = 179
		 * 10진수를 2, 8, 16로 바꿀 수 있음
		 * 
		 * 힙 주소지는 16진수
		 */
		
		
		
		
		byte var5 = -128;
		byte var6 = -30;
		byte var7 = 0;
		byte var8 = 30;
		byte var9 = 127;
		byte var10 = 127; //byte의 범위 : -128 ~ 127 : 0을 양수 취급함
		//1bit(0,1 = 2개로 이루어져있음) 8bit = 1byte(== 2^8 == 256)
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
	}
}
		

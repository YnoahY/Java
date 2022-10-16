package test1;

import java.util.Scanner;

public class Test3_1 {
		//my test
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
	System.out.println("[필수 정보 입력]");
	String str1 = scr.nextLine();
	System.out.print("1. 이름 : " + str1 + "n" );
	
	String str2 = scr.nextLine();
	System.out.println("2. 주민번호 앞 6자리: " + str2 + "/n");
	
	String str3 = scr.nextLine();
	System.out.println("3. 전화번호: " + str3);

	}

}

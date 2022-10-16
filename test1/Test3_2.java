package test1;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
	System.out.println("[필수 정보 입력]");
	String str1 = scr.nextLine();
	String str2 = scr.nextLine();
	String str3 = scr.nextLine();
	
	System.out.println("1. 이름 : " + str1);
	System.out.println("2. 주민번호 앞 6자리: " + str2);
	System.out.println("3. 전화번호: " + str3);

	}

}

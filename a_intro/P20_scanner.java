package a_intro;

import java.util.Scanner;

public class P20_scanner {

	public static void main(String[] args) throws Exception{
		//Scanner 클래스: 클래스기 때문에 객체 생성해야함
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {inputData = scanner.nextLine(); 
		//nextLine: 종료시점 - enter(keyCode:10,13)하는 순간 종료, enter 전까지 인식
		//next, nextInt: enter(keyCode:10,13을 종료 시점으로 인식x)가 종료 시점이 아님 ->10,13까지 출력되면서 문제 생길 가능성 있음
		//nextInt사용법 : nextLine로 작업 후 parseInt() 사용해서 정수로 전환
		System.out.println("입력된 문자열: \"" + inputData + "\"");
		if(inputData.equals("q")) {
			break;
		}
		}
		System.out.println("종료");
	}

}

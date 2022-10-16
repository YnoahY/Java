package a_intro;

public class P04_char {

	public static void main(String[] args) {
		char c1 = 'A'; //문자 직접 저장
		//char = 아스키코드, ''사용, 문자&숫자 전부 받음(기본제공: 알파벳 대소문자, 숫자)
		//String = 문자열, ""사용
		char c2 = 65; //10진수
		char c3 = '\u0041';  //유니코드 : \\u, 0041 : 16진수 
		
		char c4 = '가'; //문자 직접 저장
		char c5 = 44032; //10진수
		char c6 = '\uac00'; //16진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}

}

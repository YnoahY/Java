package a_intro;

public class P19_readStop {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) { //조건식
				break; //가장 가까운 while문을 종료
				//continue : 특정 조건 무시 후 진행
			}
		}
			System.out.println("종료");
	}

}

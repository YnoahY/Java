package index04.sec01;

public class Exam04_IfDiceExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		if(num==1 ) {
			System.out.println(1);
		} else if(num==2 ) {
			System.out.println(2);
		} else if(num==3 ) {
			System.out.println(3);
		} else if(num==4 ) {
			System.out.println(4);
		} else if(num==5 ) {
			System.out.println(5);
		} else {
			System.out.println(6);
		}

	}

}

/*Math.random()메소드 

 * Math.random()*최대값
 * Math.random()*(최대값-최소값) + 최소값
 
 * 지원값
 * 0.0 <= Math.random() <1.0
 
 *(int)(Math.random()*6) 
  0.0 * 6 = 0 
  0.1 * 6 = 0.6 
  0.2 * 6 = 1.2 
  . 
  . 
  . 
  0.9 * 6 = 5.4 (int로 강제 형변환 → 5의 값만 갖음)
 
 * (int)(Math.random()*6) + 1;
   5.4에서 5 → 5 +1 =6 // 최종값 6
 */
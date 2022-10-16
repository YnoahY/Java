package a_intro;

public class P17_for {

	public static void main(String[] args) {
		int i = 0;
		for ( i=0; i<=10; i++ ) {
			if (i%2 == 0) {  
				System.out.println(i);
			} else {
				continue; 
				//반복문안에서 어떤 조건을 충족하였을때 수행문을 수행하지 않고 다시 조건을 검토
				//countinue ->증감식으로 이동
			}
		}

	}

}

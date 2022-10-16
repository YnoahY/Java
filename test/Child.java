package test;

public class Child extends Parent { //설계도_객체 생성의 밑바탕

	public Child() {
		super(); //: 부모인 parent의 기본생성자를 호출해서 사용
		//굳이 부모 기본생성자 쓸 필요x
		//자동형변환 되어 parent 타입으로 변함
	}
	
	
	@Override
	public void introduce() {
		System.out.println("Hi, im' a child!");
	}
	
	
}

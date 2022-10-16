package test;

public class Parent { //설계도_객체 생성의 밑바탕
	//부모 클래스
	public void introduce() {
		System.out.println("Hi, im' a parent!");
	}

}


//super(참조변수) : 자식 측에서 생성한 생성자와 부모의 생성자 중 부모의 기본생성자를 사용
//부모 클래스에서 상속 되는 것 : 메소드, 필드 but 
//member 변수 : 클래스 안에 있는것 - 생성자, 메소드, 필드 세개 중 유일하게 상속의 대상이 되지 않음 : 생성자

//Child child = new Child(); -> 가능
//Parent child1 = new Child(); -> 가능, 프로모션(자동형변환)
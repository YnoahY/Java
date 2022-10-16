package test;

public class Main { 

	public static void main(String[] args) { //실행 클래스 ex)연습장
		//같은 클래스 내부 - class public
		Member member = new Member();
		int age = member.getAge();
		System.out.println("age= " + age);
		
		//set: 값 저장
		member.setName("나");
		member.setAge(20);
		member.setGender("여");
		member.setPhone("010-8888-8888");
		
		//get : 저장 된 값 불러옴
		System.out.println("저는" + member.getAge() + "살 이고, "
				+ "이름은 " + member.getName() + "입니다.");
		System.out.println("저는 " + member.getGender() + "이고, 제 번호는 "
				+ member.getPhone()+" 입니다.");
		
		//출력
		Child child = new Child();
		child.introduce(); //자식이 상속 받은 것
		
		Parent child1 = new Child();
		child1.introduce(); /* new child로 객체 생성 후 변수로 들어가면서 자동형변환 -> 본체 child
								=>type이 parent가 됨, parent의 값
								ex) 변수라는 큰 방(Parent)에 child가 들어감 - 주체는 child*/
		/* *자식 메소드 확인 후 없을 시 부모 클래스에서 확인 함*/
		
		Parent child2 = new Parent();
		child2.introduce(); //부모형
		
		//Child child3 = (Child)new Parent();
		//child3.introduce(); //값손실로 인한 오류
		
	}

}

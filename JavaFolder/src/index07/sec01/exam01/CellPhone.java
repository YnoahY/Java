package index07.sec01.exam01;

public class CellPhone { //클래스: 설계도/ 선언(class + class이름)
	//필드: class내 정의된 변수=class에 대한 속성/ 변수 선언(자료형 + 변수이름)
	String model;
	String color;
	/*(객체: class 통해 만들어진 결과문, class간 연결고리 및 제어 역할/ 설계도에 따른 결과문)
	    : 참조변수 자료형 + 참조변수명 = new(메모리 내 인스턴스 생성) + 생성자호출 */
	
	/*생성자: class내 인스턴스가 생성될 때 호출되는 특별한 형태의 인스턴스 초기화 메소드
	 * 생성자 이름 = class 이름
	 * 생성자는 리턴값x
	 */
	
	/* 메소드: 멤버 함수, 객체 동작에 해당하는 {}블록 
	 * 필드 읽고 수정, 다른객체 생성 후 다양한 기능 수행
	 * 객체간 데이터 전달 수단
	 * 외부로 부터 매개값 받을 수 있고, 실행 후 어떤 값 반환 가능
	 * 메소드선언(리턴을 원하는 자료형)
	 */
	void powerOn() { System.out.println("전원 ON"); }
	void powerOff() { System.out.println("전원 OFF"); }
	void bell() { System.out.println("전화왔어요."); }
	void sendVoice(String message) { System.out.println("나: " + message); }
	void receiveVoice(String message) { System.out.println("상대: " + message); }
	void hangUp() {System.out.println("전화 종료."); }
	

}

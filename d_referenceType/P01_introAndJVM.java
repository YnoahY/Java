package d_referenceType;

public class P01_introAndJVM {

}
/* jvm(java virtual machine) : 자바가 독립적인 언어인 이유
	- 어떠한 운영체제에서도 java 사용 가능 -> os의 구애를 받지 않음
	  (java와 os사이에서 잘 적용될 수 있도록 함 => 호환성 상승, 중개자 역할)
	- jvm 역할 : java가 운영 가능하도로 환경설정 해줌
		
* jvm이 보유한 중요 기능: garbage collector -> 할당 받은 메모리 청소(메모리 누수 방지)*/



/*컴파일: 고급언어(원시 언어)를 저급언어(기계어)로 번역
  1. 컴파일러 방식: 완료된 코드를 한 번에 전체를 번역 (c, java, c++...)
  2. 인터프리터 방식 : 코드를 한 줄씩 번역 => 스크립트 언어(html, css, js, 파이썬..)*/

//pvm : 파이썬 virtual machine


/*객체 : 스택을 거쳐 힙에 저장 - 스택은 힙의 주소값 저장   */

/* 배열 제작 방식 
 * 1. 직접주입 : ex) int [] num = {90,80,.70};
 * 2. 간접주입 : ex) int [] num = new int[3];
 * 				  num[0] = 10; num[1] = 15; num[2] = 13; */


/* null = 값x = 無 
 * 0 = 기본값 */


/* 힙 영역에 메모리 차지하는건(저장) 객체가 아닌 객체(클래스)의 주소지, 
   그저 정보의 집합체 new를 이용해서 객체 생성을 해야만 객체로 인식 */


//인스턴스 = 오브젝트 = 객체
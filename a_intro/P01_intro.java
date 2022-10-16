package a_intro;

public class P01_intro {

	public static void main(String[] args) { //<-메소드
		int value = 1;
		/* 변수 : 빈 공간 ->메모리는 잡아먹음
		 * 형 지정 - 메모리 낭비(byte) 방지 및 기타 문제
		 * 타입과 변수 값은 일치 해야함 */
		
		int result = value + 10;
		//	변수    =  값(변수의 주소지)
		//메모리 내부에 공간 만드려면 주소지 필요
		
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp = x; //temp : 임시 변수
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
		
	}

}

/* 기본타입 : 문자, 숫자, 논리 
 * 문자 : char
 * 정수 : byte, short, int, long
 * 실수 : float, double
 * 논리 : boolean
 * 참조 : String 
 * 메모리 영역 : stack(자료 구조이면서 영역/ 작음, 선입후출-입구 1곳/ 기본타입이 쌓임/ stack의 방식은 후입선출(Last In First Out)), 
 * 			: heap(용량큼, 무거움 / 객체의 주소, 배열, 리스트 / 동적)
 * 			: static(정적)
 */

/* 메모리 
 * 낮은 메모리(row memory)   : 코드 영역(텍스트 영역-메모리에 남음), 
 * 						  : 데이터 영역(전역변수, 정적(static) 변수/정적인 공간 / 프로그램 시작 시 할당, 종료 되면 소멸), 
 * 						  : 힙 영역(프로그래머가 직접 할당, 해제 하는 메모리 공간/ 리스트, 배열, 객체 등 쌓임-동적인것 / 선입선출:queue의 방식이 선입선출(First In First Out ) 즉 FiFO다/ 서버 종료시 없어진다고 생각하면 될 듯)
 * 높은 메모리(high memory)  : 스택 영역(지역 변수, 매개변수(parameter), 힙보다 작은 영역/ 메소드 시작시 공간 할당 되고 끝날때 공간 회수 함)
 */

/*
 * 정적 변수(static variable) : 정적인 메모리에 할당, 상수로 많이 씀
 * 전역 변수(global variable) : 코드 맨 앞에 나오는 변수, 중문 밖에 작성, 한 클래스 안에서 자유롭게 사용 가능, 메모리 소모가 큼
 * -------------------------------------------------------------------------------------^데이터 영역
 * 지역 변수(local variable) : 메소드 시작시 공간 할당 되고 끝날때 공간 회수 함(매개변수도 동일)
 * 매개 변수
 * 객체생성과 동시에 힙의 주소지가 생성 -> 스택에 저장(힙으로 가는 주소지 저장) - 힙(필요 데이터, 메모리 저장)
 * .(온점)의 역할 : 객체가 갖은 메소드 사용
 *  변수. -> 갖고 있는 메소드를 사용
 *  static은 정적인 곳에 저장해서 바로 사용 가능
 *  가장 큰 영역의 메모리를 갖고 있는것 = heap(무거운거 몰아넣는 이유, 제일 큼)*/

/* 오버플로우 : 넘침 -힙, 스택영역에서 발생 - 메모리 용량이 넘쳐 타 영역을 침범함
 * 스택 오버 플로우 : 스택->힙으로 넘침-주로 발생
 * 언데 플로우 : 스택 영역에 아무것도 없는 상태임에도 불구하고 데이터를 빼내려고 할 때 발생하는 에러(pop에서 발생) 
 * 스택 - pop(데이터 넣음), pop(데이터 빼냄)*/

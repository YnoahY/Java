package index07.sec01.exam01;

public class DmbCellPhone extends/*부모클래스 호출*/ CellPhone {
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송 수신 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경");
	}
	void turnOffDmb() {
		System.out.println("방송 수신 종료");
	}

}

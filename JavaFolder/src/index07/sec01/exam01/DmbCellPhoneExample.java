package index07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성", "바이올렛", 10);
		
		//CellPhone으로 부터 상속 받은 필드
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("channel: " + dmbCellPhone.channel);
		System.out.println();
		
		//CellPhone으로 부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요.");
		dmbCellPhone.sendVoice("네, 안녕하세요.");
		dmbCellPhone.hangUp();
		System.out.println();
		
		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(18);
		dmbCellPhone.turnOffDmb();

	}

}

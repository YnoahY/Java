package index07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�Ｚ", "���̿÷�", 10);
		
		//CellPhone���� ���� ��� ���� �ʵ�
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("channel: " + dmbCellPhone.channel);
		System.out.println();
		
		//CellPhone���� ���� ��� ���� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���.");
		dmbCellPhone.sendVoice("��, �ȳ��ϼ���.");
		dmbCellPhone.hangUp();
		System.out.println();
		
		//DmbCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(18);
		dmbCellPhone.turnOffDmb();

	}

}

package index07.sec01.exam01;

public class DmbCellPhone extends/*�θ�Ŭ���� ȣ��*/ CellPhone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� ��� ���� ����");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ ����");
	}
	void turnOffDmb() {
		System.out.println("��� ���� ����");
	}

}

package index07.sec01.exam01;

public class CellPhone { //Ŭ����: ���赵/ ����(class + class�̸�)
	//�ʵ�: class�� ���ǵ� ����=class�� ���� �Ӽ�/ ���� ����(�ڷ��� + �����̸�)
	String model;
	String color;
	/*(��ü: class ���� ������� �����, class�� ����� �� ���� ����/ ���赵�� ���� �����)
	    : �������� �ڷ��� + ���������� = new(�޸� �� �ν��Ͻ� ����) + ������ȣ�� */
	
	/*������: class�� �ν��Ͻ��� ������ �� ȣ��Ǵ� Ư���� ������ �ν��Ͻ� �ʱ�ȭ �޼ҵ�
	 * ������ �̸� = class �̸�
	 * �����ڴ� ���ϰ�x
	 */
	
	/* �޼ҵ�: ��� �Լ�, ��ü ���ۿ� �ش��ϴ� {}��� 
	 * �ʵ� �а� ����, �ٸ���ü ���� �� �پ��� ��� ����
	 * ��ü�� ������ ���� ����
	 * �ܺη� ���� �Ű��� ���� �� �ְ�, ���� �� � �� ��ȯ ����
	 * �޼ҵ弱��(������ ���ϴ� �ڷ���)
	 */
	void powerOn() { System.out.println("���� ON"); }
	void powerOff() { System.out.println("���� OFF"); }
	void bell() { System.out.println("��ȭ�Ծ��."); }
	void sendVoice(String message) { System.out.println("��: " + message); }
	void receiveVoice(String message) { System.out.println("���: " + message); }
	void hangUp() {System.out.println("��ȭ ����."); }
	

}

class Ex7_3C{
	void printmsg() {
		System.out.println("���� Ŭ�����Դϴ�");
	}
}
class Sub_73 extends Ex7_3C{
	void printmsg() {
		super.printmsg();	//����Ŭ������ �޼ҵ� ȣ��� �޼ҵ� �տ� super ����
		System.out.println("���� Ŭ���� �Դϴ�.");
	}
}
public class Ex7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_73 sub = new Sub_73();
		sub.printmsg();
	}

}

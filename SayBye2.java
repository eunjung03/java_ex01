// �������̵��� super
class Greeting2{
	void bye() {
		System.out.println("���� Ŭ����: Good bye");
	}
}
class Insa2 extends Greeting2{
	void bye() {	//���� Ŭ�������� ���� Ŭ���� bye �޼ҵ� �������̵�
		System.out.println("���� Ŭ����: bye");
		super.bye();	//���� Ŭ������ bye()�޼ҵ� ȣ��
	}
}
public class SayBye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insa2 ob = new Insa2();
		
		ob.bye();	//���� Ŭ������ �������̵� �޼ҵ� ȣ��
	}

}

//�������̵�
class Greeting{
	void byebye() {
		System.out.println("���� Ŭ����: Bye bye");
	}
	void bye() {
		System.out.println("���� Ŭ����: Good bye");
	}
}
class Insa extends Greeting{
	void bye() {	//�������̵�
		System.out.println("���� Ŭ����: bye");
	}
}
public class SayBye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insa insa = new Insa();
		
		insa.byebye();		//���� Ŭ������ �޼ҵ� ȣ��
		insa.bye(); 		//���� Ŭ������ �������̵� �޼ҵ� ȣ��		
		
	}

}

class Greet1{
	void greet() {
		//nothing
	}
}
interface Bye{
	void bye();	//public abstract void talk();
}
class Greeting1 extends Greet1 implements Bye{
	//class Greeting implements Bye extends Greet{ ������ �ٲٸ� ����
	void greet() {//�������̵�
		System.out.println("�ȳ��ϼ���.");
	}
	public void bye() {
		System.out.println("�ȳ��� �輼��.");
	}
}
public class Meet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting1 og = new Greeting1();
		og.greet();
		og.bye();
	}

}

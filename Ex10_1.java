abstract class exStudy_10{
	abstract void printmsg();
}
class Study_10 extends exStudy_10{
	void printmsg() {
		System.out.println("�ڹٴ� ��̷ӽ��ϴ�.");
	}
}
public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Study_10 jv = new Study_10();
		jv.printmsg();
	}

}

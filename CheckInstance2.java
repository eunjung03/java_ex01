interface ITell{
	void tell();
}
interface ICry extends ITell{
	void cry();
}
class insCat implements ICry{
	public void tell() {
		System.out.println("�߿�~");
	}
	public void cry() {
		System.out.println("�߿˾߿�~");
	}
}
public class CheckInstance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insCat ocat = new insCat();
		
		if(ocat instanceof ITell) {
			System.out.println("ocat�� �������̽� ITell�� �����Ѵ�.");
			ocat.tell();
		}
		if(ocat instanceof ICry) {
			System.out.println("ocat�� �������̽� ICry�� �����Ѵ�.");
			ocat.cry();
		}
	}

}

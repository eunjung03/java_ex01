interface ITell{
	void tell();
}
interface ICry extends ITell{
	void cry();
}
class insCat implements ICry{
	public void tell() {
		System.out.println("야옹~");
	}
	public void cry() {
		System.out.println("야옹야옹~");
	}
}
public class CheckInstance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insCat ocat = new insCat();
		
		if(ocat instanceof ITell) {
			System.out.println("ocat은 인터페이스 ITell을 구현한다.");
			ocat.tell();
		}
		if(ocat instanceof ICry) {
			System.out.println("ocat은 인터페이스 ICry을 구현한다.");
			ocat.cry();
		}
	}

}

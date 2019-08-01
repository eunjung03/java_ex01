class Ex7_3C{
	void printmsg() {
		System.out.println("상위 클래스입니다");
	}
}
class Sub_73 extends Ex7_3C{
	void printmsg() {
		super.printmsg();	//슈퍼클래스의 메소드 호출시 메소드 앞에 super 붘임
		System.out.println("서브 클래스 입니다.");
	}
}
public class Ex7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_73 sub = new Sub_73();
		sub.printmsg();
	}

}

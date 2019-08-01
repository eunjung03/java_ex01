// 오버라이딩과 super
class Greeting2{
	void bye() {
		System.out.println("슈퍼 클래스: Good bye");
	}
}
class Insa2 extends Greeting2{
	void bye() {	//서브 클래스에서 슈퍼 클래스 bye 메소드 오버라이딩
		System.out.println("서브 클래스: bye");
		super.bye();	//슈퍼 클래스의 bye()메소드 호출
	}
}
public class SayBye2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insa2 ob = new Insa2();
		
		ob.bye();	//서브 클래스의 오버라이딩 메소드 호출
	}

}

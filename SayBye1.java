//오버라이딩
class Greeting{
	void byebye() {
		System.out.println("슈퍼 클래스: Bye bye");
	}
	void bye() {
		System.out.println("슈퍼 클래스: Good bye");
	}
}
class Insa extends Greeting{
	void bye() {	//오버라이딩
		System.out.println("서브 클래스: bye");
	}
}
public class SayBye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insa insa = new Insa();
		
		insa.byebye();		//슈퍼 클래스의 메소드 호출
		insa.bye(); 		//서브 클래스의 오버라이딩 메소드 호출		
		
	}

}

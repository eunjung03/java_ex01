class Greet1{
	void greet() {
		//nothing
	}
}
interface Bye{
	void bye();	//public abstract void talk();
}
class Greeting1 extends Greet1 implements Bye{
	//class Greeting implements Bye extends Greet{ 순서를 바꾸면 에러
	void greet() {//오버라이딩
		System.out.println("안녕하세요.");
	}
	public void bye() {
		System.out.println("안녕히 계세요.");
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

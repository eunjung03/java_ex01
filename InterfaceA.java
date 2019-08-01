interface IA{
	public static final int a=2;
	public void say();
}
class IA_B implements IA{
	public void say() {
		System.out.println("Hello");
	}
}
public class InterfaceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IA_B ob = new IA_B();
		
		System.out.println("ob.a = "+ob.a);//interface IA에 들어있는 a값을 가져옴 IA_B가 아님
		ob.say();
	}

}

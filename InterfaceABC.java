interface IA1{
	public abstract void sayA();
}
interface IB1{
	public abstract void sayB();
}
interface IC1{
	public abstract void sayC();
}
class X implements IA1,IB1,IC1{//추상 메소드 오버라이딩
	public void sayA() {
		System.out.println("A: Hello!");
	}
	public void sayB() {
		System.out.println("B: Hi!");
	}
	public void sayC() {
		System.out.println("C: How are U?"); 
	}
}
public class InterfaceABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		X ox = new X();
		
		ox.sayA();
		ox.sayB();
		ox.sayC();
	}

}

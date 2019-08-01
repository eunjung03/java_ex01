interface interA{
	public final int a = 1;
	public abstract void f();
}
interface interB{
	public final int b = 2;
	public abstract void g();
}
interface interC{
	public final int c = 3;
	public abstract void h();
}
interface interX extends interA, interB, interC{
	public final int d = 4;
	public abstract void i();
}
class CX implements interX{
	public void f() {//interface interA의 메소드
		System.out.println("interface interA's f, a = "+a);
	}
	public void g() {//interface interB의 메소드
		System.out.println("interface interB's g, b = "+b);
	}
	public void h() {//interface interC의 메소드
		System.out.println("interface interB's h, c = "+c);
	}
	public void i() {//interface interX의 메소드
		System.out.println("interface interB's i, d = "+d);
	}
}
public class InterfaceX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CX ox = new CX();
		
		ox.f();
		ox.g();
		ox.h();
		ox.i();
	}

}

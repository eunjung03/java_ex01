class F{
	void a() {
		System.out.println("인수를 가지지 않는 메소드");
	}
	void b() {
		a();
	}
}
public class Method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F a = new F();
		
		a.b();
	}

}

class E{
	void a(int x) {
		System.out.println("�μ��� "+x);
		return ;
	}
	void b() {
		a(10);
	}
}
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E a = new E();
		
		a.b();
	}

}

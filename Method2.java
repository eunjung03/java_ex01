// 같은 패키지인 경우 클래스 이름이 동일하면 안된다
class B{
	double half() {
		double a = 5.0, b;
		b = a / 2.0;
		return b;
	}
}
public class Method2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B a = new B();
		System.out.println("a.half() = "+ a.half());
	}

}

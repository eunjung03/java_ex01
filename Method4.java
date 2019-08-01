// 같은 패키지인 경우 클래스 이름이 동일하면 안된다
class D{
	void print() {
		System.out.println("반환값X, 인자X 경우");
		return;
	}
}
public class Method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D a = new D();
		
		a.print();
	}

}

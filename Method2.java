// ���� ��Ű���� ��� Ŭ���� �̸��� �����ϸ� �ȵȴ�
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

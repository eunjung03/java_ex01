class A{
	int add(int a, int b) {
		int x;
		x = a + b;
		return x;
	}
}
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();	// ������Ʈ a ����
		A b = new A();
		System.out.println("a.add(1,2) = "+a.add(1,2)); //�޼ҵ� add() ȣ��
		System.out.println("b.add(5,6) = "+b.add(5,6));
	}

}

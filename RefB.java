class ReB{
	private static int b = 1;
	static int get() {
		return b;
	}
}
public class RefB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ReB.b = "+ ReB.get());	//Ŭ������ �޼ҵ� ���
		ReB ob = new ReB();
		System.out.println("ob.b = "+ ob.get());	//������Ʈ�� �޼ҵ� ���
	}

}

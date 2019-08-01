class ComA{
	static int a;	//같은 클래스의 오브젝트들 사이에서 공유됨
}
public class CommonA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComA a1 = new ComA();
		ComA a2 = new ComA();
		
		a1.a = 50;
		
		System.out.println("a1.a = "+a1.a);
		System.out.println("a2.a = "+a2.a);
	}

}

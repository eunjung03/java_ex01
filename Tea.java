class Eat{
	void print1() {
		System.out.print(" E ");
	}
	void print2() {
		System.out.print(" A ");
	}
	void print3() {
			System.out.print(" T ");
	}
}
public class Tea {
	public static void main(String[] args) {		//���α׷��� ������
			// TODO Auto-generated method stub

		Eat ob = new Eat();		//��ü ����
		ob.print3();
		ob.print2();
		ob.print1();
	}

}

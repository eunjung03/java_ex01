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
	public static void main(String[] args) {		//프로그램의 시작점
			// TODO Auto-generated method stub

		Eat ob = new Eat();		//객체 생성
		ob.print3();
		ob.print2();
		ob.print1();
	}

}

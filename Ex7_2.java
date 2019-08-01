// 잘못된 부분 찾기

class Ex7_er{
	private int a;
	private int b;
	void setVar(int a, int b) {
		a = c;
		b = d;		//슈퍼 클래스의 private 멤버 변서를 접근할 수 있도록 메소드를 슈퍼 클래스에서 제공해야함
	}
}
class Sub_ex7 extend Ex7_er {		//extend가 아니라 extends 
	void printmsg() {
		System.out.println("변수 a : "+a);
		System.out.println("변수 b : "+b);	//private 멤버 변수에 직접 접근할 수 없음
	}
}
public class Ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_ex7 s = new Sub_ex7();
		setVar(4,6);		//s.setVar(4,6)으로 수정해야함
		S.printmsg();
	}

}

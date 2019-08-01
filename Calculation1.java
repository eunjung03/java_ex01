abstract class CCalc1{//추상클래스
	int a;
	int b;
	
	abstract void answer();//추상 메소드
	
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
class Plus extends CCalc1{
	void answer(){//answer() 메소드 오버라이딩
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
public class Calculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plus ob = new Plus();
		ob.setData(12,34);
		ob.answer();
	}

}

abstract class CCalc2{
	int a;
	int b;
	
	abstract int result();	//추상 메소드로 선언: 처리 내용은 없음
	
	void printResult() {
		System.out.println(result());
	}
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
class cPlus extends CCalc2{
	int result() { return a+b; }	//오버라이딩
}
class cMinus extends CCalc2{
	int result() { return a-b; }	//오버라이딩
}
public class Calculation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 34, y = 12;
		CCalc2 rp = new cPlus();		//rp는 cPlus의 오브젝트
		CCalc2 rm = new cMinus();	//rm은 cMinus의 오브젝트
		//슈퍼클래스는 서브 클래스의 생성자를 호출해서 오브젝트를 생성할 수 있다.
		
		rp.setData(x, y);
		rm.setData(x, y);
		System.out.printf("%d + %d = ",x,y);
		rp.printResult();
		System.out.printf("%d - %d = ",x,y);
		rm.printResult();
	}

}

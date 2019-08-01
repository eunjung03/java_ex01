class CCalc3{
	int a;
	int b;
	
	int result() { return 0; }
	
	void printResult() {
		System.out.println(result());
	}
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
class ex_10Plus extends CCalc3{
	int result() { return a+b; }
}
class ex_10Minus extends CCalc3{
	int result() { return a-b; }
}
public class Ex10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=34, y=12;
		CCalc3 rp3 = new ex_10Plus();
		CCalc3 rm3 = new ex_10Minus();
		
		rp3.setData(x, y);
		rm3.setData(x, y);
		
		System.out.printf("%d + %d = ",x,y);
		rp3.printResult();
		System.out.printf("%d - %d = ",x,y);
		rm3.printResult();
	}

}

abstract class CCalc2{
	int a;
	int b;
	
	abstract int result();	//�߻� �޼ҵ�� ����: ó�� ������ ����
	
	void printResult() {
		System.out.println(result());
	}
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
class cPlus extends CCalc2{
	int result() { return a+b; }	//�������̵�
}
class cMinus extends CCalc2{
	int result() { return a-b; }	//�������̵�
}
public class Calculation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 34, y = 12;
		CCalc2 rp = new cPlus();		//rp�� cPlus�� ������Ʈ
		CCalc2 rm = new cMinus();	//rm�� cMinus�� ������Ʈ
		//����Ŭ������ ���� Ŭ������ �����ڸ� ȣ���ؼ� ������Ʈ�� ������ �� �ִ�.
		
		rp.setData(x, y);
		rm.setData(x, y);
		System.out.printf("%d + %d = ",x,y);
		rp.printResult();
		System.out.printf("%d - %d = ",x,y);
		rm.printResult();
	}

}

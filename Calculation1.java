abstract class CCalc1{//�߻�Ŭ����
	int a;
	int b;
	
	abstract void answer();//�߻� �޼ҵ�
	
	void setData(int m, int n) {
		a = m;
		b = n;
	}
}
class Plus extends CCalc1{
	void answer(){//answer() �޼ҵ� �������̵�
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

// �߸��� �κ� ã��

class Ex7_er{
	private int a;
	private int b;
	void setVar(int a, int b) {
		a = c;
		b = d;		//���� Ŭ������ private ��� ������ ������ �� �ֵ��� �޼ҵ带 ���� Ŭ�������� �����ؾ���
	}
}
class Sub_ex7 extend Ex7_er {		//extend�� �ƴ϶� extends 
	void printmsg() {
		System.out.println("���� a : "+a);
		System.out.println("���� b : "+b);	//private ��� ������ ���� ������ �� ����
	}
}
public class Ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sub_ex7 s = new Sub_ex7();
		setVar(4,6);		//s.setVar(4,6)���� �����ؾ���
		S.printmsg();
	}

}

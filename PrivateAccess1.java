// private ���� ������
class PR1{
	private int a = 1;	//������ �� �ִ� ����� �����ؾ� ��
			int b = 2;
			
	int getA() {	//default
		return a;	// private int a �� Ŭ���� ������ ������ �� ����
	}
}
class PR_y{
	void print() {
		PR1 x1 = new PR1();
		
	    //System.out.println("x1.a = "+x1.a); 		 ���� ���� �Ұ��� -> ������ ����
		System.out.println("x1.a = "+x1.getA()); 	//�޼ҵ带 ���ؼ� a�� ����
		System.out.println("x1.b = "+x1.b); 		//���� ���� ����
	}
}
public class PrivateAccess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PR_y oy = new PR_y();
		
		oy.print();
	}

}

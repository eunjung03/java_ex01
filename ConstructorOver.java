//�������� �����ε�
class Over_A{
	int s, t, r;
	
	//Ŭ���� Over_A�� ������(�μ�x)
	Over_A(){	
		System.out.println("�μ� ���� �����ڰ� ȣ���");
		System.out.printf("s = %d, t = %d, r = %d\n",s,t,r);
	}
	//Ŭ���� Over_A�� ������(2���� �μ�)
	Over_A(int a, int b){
		s = a;
		t = b;
		System.out.println("�μ� �ִ� �����ڰ� ȣ���");
		System.out.printf("s = %d, t = %d, r = %d\n", s, t, r);
	}
}
public class ConstructorOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Over_A oa1 = new Over_A();		//������Ʈ oa1 ����
		Over_A oa2 = new Over_A(3,4);	//������Ʈ oa2 ����
	}

}

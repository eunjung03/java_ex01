//�μ��� ������ ������ �ٸ� ����� ������ ����
class Test_C{
	int s, t;
	float d;
	
	Test_C(int a, int b){
		s = a;
		t = b;
		System.out.println("������ Test_C()�� ȣ���");
	}
}
public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_C c = new Test_C(3); 		//�μ� ������ �ٸ��Ƿ� ������ ����
		
		System.out.printf("c.s = %d, c.t = %d, c.d = %f",c.s,c.t,c.d);

	}
}

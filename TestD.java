//�μ��� �ڷ����� �ٸ� ����� ������ ����
class Test_D{
	int s, t;
	float d;
	
	Test_D(int a, int b){
		s = a;
		t = b;
		System.out.println("������ D()�� ȣ���");
	}
}
public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_D d = new Test_D(1.2, 3.4); 	//�μ��� �ڷ����� �ٸ��� ������ ������ ����
		
		System.out.printf("d.s = %d, d.t = %d, d.d = %f",d.s,d.t,d.d);
	}

}

//�μ��� ���� ������
class Test_a{
	int a,b,c;
	float d;
	
	Test_a(){
		a=1;
		b=2;
		c=2;
		System.out.println("������ Test_a()�� ȣ���");
	}
}

public class TestA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_a a = new Test_a();
		
		System.out.printf("a.a = %d, a.b = %d, a.c = %d, a.d = %f",a.a,a.b,a.c,a.d);
		// d�� 0.0���� �ʱ�ȭ ��
	}

}

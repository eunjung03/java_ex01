//�μ��� �ִ� ������
class Test_B{
		int s, t;
		float d;
		
		Test_B(int a, int b){
			s = a;
			t = b;
			System.out.println("������ Test_B()�� ȣ���");
		}
	}

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_B b = new Test_B(3,4);
		
		System.out.printf("b.s = %d, b.t = %d, b.d = %f",b.s,b.t,b.d);
	}

}


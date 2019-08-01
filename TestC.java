//인수가 있지만 개수가 다른 경우의 컴파일 오류
class Test_C{
	int s, t;
	float d;
	
	Test_C(int a, int b){
		s = a;
		t = b;
		System.out.println("생성자 Test_C()가 호출됨");
	}
}
public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_C c = new Test_C(3); 		//인수 개수가 다르므로 컴파일 오류
		
		System.out.printf("c.s = %d, c.t = %d, c.d = %f",c.s,c.t,c.d);

	}
}

//인수가 없는 생성자
class Test_a{
	int a,b,c;
	float d;
	
	Test_a(){
		a=1;
		b=2;
		c=2;
		System.out.println("생성자 Test_a()가 호출됨");
	}
}

public class TestA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_a a = new Test_a();
		
		System.out.printf("a.a = %d, a.b = %d, a.c = %d, a.d = %f",a.a,a.b,a.c,a.d);
		// d는 0.0으로 초기화 됨
	}

}

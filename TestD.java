//인수의 자료형이 다른 경우의 컴파일 오류
class Test_D{
	int s, t;
	float d;
	
	Test_D(int a, int b){
		s = a;
		t = b;
		System.out.println("생성자 D()가 호출됨");
	}
}
public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_D d = new Test_D(1.2, 3.4); 	//인수의 자료형이 다르기 떄문에 컴파일 오류
		
		System.out.printf("d.s = %d, d.t = %d, d.d = %f",d.s,d.t,d.d);
	}

}

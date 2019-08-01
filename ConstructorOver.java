//생성자의 오버로딩
class Over_A{
	int s, t, r;
	
	//클래스 Over_A의 생성자(인수x)
	Over_A(){	
		System.out.println("인수 없는 생성자가 호출됨");
		System.out.printf("s = %d, t = %d, r = %d\n",s,t,r);
	}
	//클래서 Over_A의 생성자(2개의 인수)
	Over_A(int a, int b){
		s = a;
		t = b;
		System.out.println("인수 있는 생성자가 호출됨");
		System.out.printf("s = %d, t = %d, r = %d\n", s, t, r);
	}
}
public class ConstructorOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Over_A oa1 = new Over_A();		//오브젝트 oa1 생성
		Over_A oa2 = new Over_A(3,4);	//오브젝트 oa2 생성
	}

}

class SubA{
	int m = -10;
	void p() {
		System.out.println("슈퍼클래스 p()");
	}
}
class SubB extends SubA{
	int n = 20;
	void p() {//슈퍼클래스의 p()의 오버라이딩
		System.out.println("서브클래스 p()");
	}
	void q() {
		System.out.println("서브클래스 q()");
	}
}
public class Sub2Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubA oa = new SubA();
		SubB ob = new SubB();
		
		System.out.println("oa.m = "+oa.m);
		oa.p(); //슈퍼클래스의 p()가 호출됨
		
		ob.m = 10; //슈퍼클래스로부터 상속받은 필드 m
		oa = ob; //서브클래스의 오브젝트를 슈퍼클래스의 오브젝트에 대입
		
		System.out.println("oa.m = "+oa.m);//oa.m = -10 -> 10 변경됨
		System.out.println("ob.m = "+ob.m);
		//System.out.println("oa.n = "+oa.n); //컴파일 오류
		System.out.println("ob.n = "+ob.n);
		oa.p();		//서브클래스의 p()가 호출됨
		//oa.q();	//슈퍼클래스 오브젝트가 서브클래스 오브젝트의 q()를 사용 못함
	}

}

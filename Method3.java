// 같은 패키지인 경우 클래스 이름이 동일하면 안된다
class C{
	void disp(int a) {
		System.out.println("인수의 값은 "+a);
		return ; 	//반환값 없음. 생략가능
	}
}
public class Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C a = new C();
		
		a.disp(1001);	// 메소드 disp() 호출
	}

}

//private 접근 제한자
//private의 멤버(필드,메소드,생성자)는 서브 클래스로 상속해도 직접 접근할 수 없음
class PR2{
	private int a = 1;		//접근 방법을 제공해야함
			int aa = 2;
	
	int getA() {
		return a;			//private int a를 클래스 내에서 접근할 수 있음
	}
}
class PR2_x extends PR2{
	int b =3;
}
public class PrivateAccess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PR2_x ob = new PR2_x();
		
	  //System.out.println("ob.a = "+ob.a); 	 슈퍼클래스 PR2의 a 접근 불가능
		System.out.println("ob.aa = "+ob.aa);	//슈퍼클래스 PR2의 aa 접근 가능
	}

}

class superX{
	int m = -10;
	superX(){
		System.out.println("슈퍼클래스 superX의 생성자 실행");
	}
}
class superY extends superX{
	int n = 10;
	superY(){//X의 생성자 실행 후 Y의 생성자 실행
		System.out.println("서브클래스 superY의 생성자 실행");
	}
}
public class SuperNewSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("superX ox1 = new superX();");
		superX ox1 = new superX();
		System.out.println();
		
		System.out.println("superX ox2 = new superY()");
		superX ox2 = new superY();	//슈퍼클래스 오브젝트에 서브클래스 생성자를 사용
		System.out.println("ox2.m = "+ox2.m);	//슈퍼클래스의 필드 m
		
		// superY oy = new superX();	//서브클래스 오브젝트에 슈퍼클래스 생성자사용 에러
	}

}

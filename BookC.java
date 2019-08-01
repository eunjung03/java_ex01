//디폴트 생성자
class BookA{
//디폴트 생성자가 동작
}
//BookB 클래스의 생성자
class BookB{
	BookB(){
		System.out.println("인수 없는 생성자 BookB()가 호출됨");
	}
}
public class BookC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookA oa = new BookA();		//디폴트 생성자가 동작
		BookB ob = new BookB();		//BookB 생성자가 동작
	}

}

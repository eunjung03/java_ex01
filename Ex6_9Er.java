class E69er{
	public void Message() {			// static 메소드가 아님
		System.out.println("정적 메소드가 아닙니다.");
	}
}

public class Ex6_9Er {

	public static void main(String[] args) {
		//main 메소드도 처음 실행될때 오브젝트 없기 때문에 static

		E69er ob = new E69er();
		ob.Message();			
		E69er.Message();			//static이 아닌 Message 메소드를 호출할 수 없음
	}

}
 
class E69{
	public static void Message() {
		System.out.println("정적 메소드입니다.");
	}
}

public class Ex6_9 {

	public static void main(String[] args) {
		//main 메소드도 처음 실행될때 오브젝트 없기 때문에 static

		E69 ob = new E69();
		ob.Message();			//객체 ob를 통해서 Message 호출
		E69.Message();			//객체없이 클래스 E69를 통해 Message 호출, static이  있어야 가능
	}

}

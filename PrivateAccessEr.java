//상속시 슈퍼클래스의 생성자 private으로 지정하면 서브클래스의 오브젝트를 생성할 수 없음

class PR_er{
	private int a;
	private int aa;		//접근할 수 있는 방법 없음
	
	private PR_er() {	//private 생성자
		//Nothing
	}
	int getA() {
		return a;		//클래스 내에서 접근할 수 있음
	}
}
class PR_ers extends PR_er {
	int b;
	PR_ers(){	// 클래스 PR_er의 생성자를 호출해야 하는데
		// Nothing 	private PR_er() 이므로 호출 불가능
	}
}
public class PrivateAccessEr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PR_ers oy = new PR_ers();
	}

}

// private 접근 제한자
class PR1{
	private int a = 1;	//접근할 수 있는 방법을 제공해야 함
			int b = 2;
			
	int getA() {	//default
		return a;	// private int a 를 클래스 내에서 접근할 수 있음
	}
}
class PR_y{
	void print() {
		PR1 x1 = new PR1();
		
	    //System.out.println("x1.a = "+x1.a); 		 직접 접근 불가능 -> 컴파일 에러
		System.out.println("x1.a = "+x1.getA()); 	//메소드를 통해서 a에 접근
		System.out.println("x1.b = "+x1.b); 		//직접 접근 가능
	}
}
public class PrivateAccess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PR_y oy = new PR_y();
		
		oy.print();
	}

}

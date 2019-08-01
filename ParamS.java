class pE{	//슈퍼클래스
	void bye() {
		System.out.println("good bye");
	}
}
class pJ extends pE{	//서브클래스
	void bye() {
		System.out.println("안녕히 계세요.");
	}
}
class EJ{
	void greet(pE e) {	//인수:슈퍼클래스의 오브젝트
		e.bye();
	}
}
public class ParamS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pE oe = new pE();
		pJ oj = new pJ();
		EJ oej = new EJ();
		
		oej.greet(oe);	//인수:슈퍼클래스의 오브젝트
		oej.greet(oj); 	//인수:서브클래스의 오브젝트
	}

}

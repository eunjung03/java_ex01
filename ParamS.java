class pE{	//����Ŭ����
	void bye() {
		System.out.println("good bye");
	}
}
class pJ extends pE{	//����Ŭ����
	void bye() {
		System.out.println("�ȳ��� �輼��.");
	}
}
class EJ{
	void greet(pE e) {	//�μ�:����Ŭ������ ������Ʈ
		e.bye();
	}
}
public class ParamS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pE oe = new pE();
		pJ oj = new pJ();
		EJ oej = new EJ();
		
		oej.greet(oe);	//�μ�:����Ŭ������ ������Ʈ
		oej.greet(oj); 	//�μ�:����Ŭ������ ������Ʈ
	}

}

class SubA{
	int m = -10;
	void p() {
		System.out.println("����Ŭ���� p()");
	}
}
class SubB extends SubA{
	int n = 20;
	void p() {//����Ŭ������ p()�� �������̵�
		System.out.println("����Ŭ���� p()");
	}
	void q() {
		System.out.println("����Ŭ���� q()");
	}
}
public class Sub2Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubA oa = new SubA();
		SubB ob = new SubB();
		
		System.out.println("oa.m = "+oa.m);
		oa.p(); //����Ŭ������ p()�� ȣ���
		
		ob.m = 10; //����Ŭ�����κ��� ��ӹ��� �ʵ� m
		oa = ob; //����Ŭ������ ������Ʈ�� ����Ŭ������ ������Ʈ�� ����
		
		System.out.println("oa.m = "+oa.m);//oa.m = -10 -> 10 �����
		System.out.println("ob.m = "+ob.m);
		//System.out.println("oa.n = "+oa.n); //������ ����
		System.out.println("ob.n = "+ob.n);
		oa.p();		//����Ŭ������ p()�� ȣ���
		//oa.q();	//����Ŭ���� ������Ʈ�� ����Ŭ���� ������Ʈ�� q()�� ��� ����
	}

}

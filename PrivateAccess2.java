//private ���� ������
//private�� ���(�ʵ�,�޼ҵ�,������)�� ���� Ŭ������ ����ص� ���� ������ �� ����
class PR2{
	private int a = 1;		//���� ����� �����ؾ���
			int aa = 2;
	
	int getA() {
		return a;			//private int a�� Ŭ���� ������ ������ �� ����
	}
}
class PR2_x extends PR2{
	int b =3;
}
public class PrivateAccess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PR2_x ob = new PR2_x();
		
	  //System.out.println("ob.a = "+ob.a); 	 ����Ŭ���� PR2�� a ���� �Ұ���
		System.out.println("ob.aa = "+ob.aa);	//����Ŭ���� PR2�� aa ���� ����
	}

}

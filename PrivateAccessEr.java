//��ӽ� ����Ŭ������ ������ private���� �����ϸ� ����Ŭ������ ������Ʈ�� ������ �� ����

class PR_er{
	private int a;
	private int aa;		//������ �� �ִ� ��� ����
	
	private PR_er() {	//private ������
		//Nothing
	}
	int getA() {
		return a;		//Ŭ���� ������ ������ �� ����
	}
}
class PR_ers extends PR_er {
	int b;
	PR_ers(){	// Ŭ���� PR_er�� �����ڸ� ȣ���ؾ� �ϴµ�
		// Nothing 	private PR_er() �̹Ƿ� ȣ�� �Ұ���
	}
}
public class PrivateAccessEr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PR_ers oy = new PR_ers();
	}

}

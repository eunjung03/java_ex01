
public class If_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=-5, ax=x;
		int y=5, ay=y;
		
		if(x<0)			//���ǽ��� ����� ���̹Ƿ�
			ax = -x;	// �����
		
		System.out.printf("abs(%d) = %d\n",x,ax);
		
		if (y<0)		//���ǽ��� ��� ����
		{
			ay = -y;	// ���� �ȵ�
			ay = -y;	// {}�� ��� ���̷��� �Ϻη� �� �� �� ǥ���� ��
		}
		
		System.out.printf("abs(%d) = %d\n",y,ay);
	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		if( args.length == 0)	//�迭 args�� ��Ҽ�
			System.out.println("Ŀ�ǵ���� �μ��� �����ϴ�.");
		else
			for(i=0; i<args.length; i++)
				System.out.println((i+1)+": "+args[i]);	//�Էµ� �μ��� ���
	}

}

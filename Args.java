//����� : java Args [�μ�]
public class Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//���� Ŭ�������� static����̹Ƿ� ������Ʈ �������� back() ���� ȣ�Ⱑ��
			back(args[0]);	//�μ��� ������ ���ܹ߻�
		}
		catch (Exception e) {
			System.out.println("Ŀ�ǵ���� �μ��� �����ϴ�.");
		}
		finally {
			System.out.println("�����մϴ�.");
		}
	}
	static void back(String a) throws Exception{
		System.out.println("Ŀ�ǵ���� �μ��� "+a+"�Դϴ�.");
	}
}


public class Printf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("12345679-ĭ���� ���� ���� ��ȣ\n");
		
		System.out.printf("%d \n",3);		// �ڵ����� ǥ�� �ڸ��� ������
		System.out.printf("%+d \n",3);		// ��ȣ ǥ��
		System.out.printf("%d = %d \n",1+2,3);
		System.out.printf("%4d \n",25);		// ǥ�� �ڸ����� 4ĭ
		System.out.printf("%04d \n",25);	// �� ĭ�� 0���� ä��
		System.out.printf("%4.1f \n",2.5);  // ��ü �ڸ� 4�ڸ�, �Ҽ��� 1�ڸ�
		System.out.printf("%04.1f \n",2.5);	// �� ĭ�� 0���� ä��
		System.out.printf("%8.1e \n",2.5);	// 10�� ���� ���·� ǥ��
	}

}

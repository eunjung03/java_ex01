class E69{
	public static void Message() {
		System.out.println("���� �޼ҵ��Դϴ�.");
	}
}

public class Ex6_9 {

	public static void main(String[] args) {
		//main �޼ҵ嵵 ó�� ����ɶ� ������Ʈ ���� ������ static

		E69 ob = new E69();
		ob.Message();			//��ü ob�� ���ؼ� Message ȣ��
		E69.Message();			//��ü���� Ŭ���� E69�� ���� Message ȣ��, static��  �־�� ����
	}

}

class E69er{
	public void Message() {			// static �޼ҵ尡 �ƴ�
		System.out.println("���� �޼ҵ尡 �ƴմϴ�.");
	}
}

public class Ex6_9Er {

	public static void main(String[] args) {
		//main �޼ҵ嵵 ó�� ����ɶ� ������Ʈ ���� ������ static

		E69er ob = new E69er();
		ob.Message();			
		E69er.Message();			//static�� �ƴ� Message �޼ҵ带 ȣ���� �� ����
	}

}
 
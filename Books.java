//���� ������
class BS{
	String title;
	String writer;
	
	BS(String t, String w){	//Ŭ���� BS�� ������
		title = t;
		writer = w;
	}
	BS(BS copy){	//Ŭ���� BS�� ���� ������
		title = copy.title;
		writer = copy.writer;
		System.out.println("���� ������ ����");
	}
	void print() {
		System.out.println("�� ��: "+title);
		System.out.println("�� ��: "+writer);
	}
}
public class Books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BS book1 = new BS("�¹���","������");
		System.out.println("---book1---");
		book1.print();
		
		BS book2 = new BS(book1);	//���� ������
		System.out.println("---book2---");
		book2.print();
		
		book2.title = "�Ƹ���";
		System.out.println("---book2---");
		book2.print();
	}

}

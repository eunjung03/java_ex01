//Ŭ������ ���� ���� Ŭ������ ����� ���
class Books__{
	String title;
	String janre;
	
	void PrintBooks__() {
		System.out.println("�� ��: "+title);
		System.out.println("�� ��: "+janre);
	}
}
class Novel extends Books__{
	String writer;
	
	void PrintNov() {
		PrintBooks__();	//���� Ŭ������ �޼ҵ� ����
		System.out.println("�� ��: "+writer);
	}
}
class Magagine extends Books__{
	int day;
	void PrintMag() {
		PrintBooks__();
		System.out.println("�߸���: "+day+"��");
	}
}
public class Bookshelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Novel nov = new Novel();	//Novel Ŭ������ ��ü ����
	
	nov.title = "�����";		//Books__ Ŭ������ �ʵ�
	nov.janre = "��������";	//Books__ Ŭ������ �ʵ�
	nov.writer = "�踸��";	//Novel Ŭ������ �ʵ�
	nov.PrintNov();			//Novel Ŭ������ �޼ҵ�
	
	System.out.println("------------");
	
	Magagine mag = new Magagine();		//Magagine Ŭ������ ��ü ����
	
	mag.title = "����21";		//Books__ Ŭ������ �ʵ�
	mag.janre = "��ȭ����";	//Books__ Ŭ������ �ʵ�
	mag.day = 20;			//Magagine Ŭ������ �ʵ�
	mag.PrintMag();			//Magagine Ŭ������ �޼ҵ�
	
	}

}

class superX{
	int m = -10;
	superX(){
		System.out.println("����Ŭ���� superX�� ������ ����");
	}
}
class superY extends superX{
	int n = 10;
	superY(){//X�� ������ ���� �� Y�� ������ ����
		System.out.println("����Ŭ���� superY�� ������ ����");
	}
}
public class SuperNewSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("superX ox1 = new superX();");
		superX ox1 = new superX();
		System.out.println();
		
		System.out.println("superX ox2 = new superY()");
		superX ox2 = new superY();	//����Ŭ���� ������Ʈ�� ����Ŭ���� �����ڸ� ���
		System.out.println("ox2.m = "+ox2.m);	//����Ŭ������ �ʵ� m
		
		// superY oy = new superX();	//����Ŭ���� ������Ʈ�� ����Ŭ���� �����ڻ�� ����
	}

}

//����� : java MyException ����
class MyException1 extends Exception{
	//nothing
}
class MyException2 extends Exception{
	//nothing
}
public class MyExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MyMethod(args[0]);
		}
		catch(MyException1 e1) {
			System.out.println("����1");
		}
		catch(MyException2 e2) {
			System.out.println("����2");
		}
		finally {
			System.out.println("��");
		}
	}
	static void MyMethod(String str) throws MyException1, MyException2{
		System.out.print("�Է°��� "+str+"�Դϴ�.");
		int x = Integer.parseInt(str);	//���ڿ��� ������ ��ȯ
		switch(x) {
			case 1:
				throw new MyException1();	//���� �߻���Ŵ
			case 2:
				throw new MyException2();	//���� �߻���Ŵ
			default:
				System.out.println("���� ����");
		}
	}
}

class OL_Calc3{
	short add(short a, int b) {
		System.out.printf("short add(%d, %d)�� ȣ���\n",a,b);
		return (short)(a+b);
	}
	int add(int a, int b) {
		System.out.printf("int add(%d, %d)�� ȣ���\n",a,b);
		return a+b ;
	}
	int add(int a, int b, int c) {
		System.out.printf("int add(%d, %d, %d)�� ȣ���\n",a,b,c);
		return a+b ;
	}
}
public class Overloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OL_Calc3 oc = new OL_Calc3();
		
		oc.add((short)1, 2);	//short add(int a, int b) ȣ��
		oc.add(1, 2, 3);		//add(int a, int b, int c)
		
		//���� �ڵ�� �ָ��� ���(������� �ʴ� ���� ����)
		oc.add(1, (short)2);			// int add(int a, int b)�� ȣ��. 
		oc.add((short)1,(short)2);		// short add(short a, short b)
	}

}

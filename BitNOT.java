
public class BitNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a= -86, r;
		// r = ~a ; // ~a�� ���� byte���� r�� ���� ����, ������ ����
		// ����Ʈ ���� �������� ������ �ִ� ���� -86 ������ �ּҰ��̹Ƿ� �����ؼ� r�� ���� ���� ����
		
		System.out.printf(" a = %4d = %X = 1010 1010\n",a,a);
		System.out.printf("~a = %4d = %X = 0101 0101\n",~a,~a);	// ��Ʈ NOT
		
		short t = (short)~a;	// ��Ʈ NOT
		r = (byte)t;			// ���� ����Ʈ�� r�� ����
		System.out.printf(" r = %4d = %X = 0101 0101\n",r,r);
	}

}

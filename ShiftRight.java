
public class ShiftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = -100, b, N = 2;
		int t;
		
		t = a >> N; // ������ ����Ʈ
		
		b = (byte)t;
		
		System.out.printf("10���� : %d >> %d = %d \n",a,N,b);
		System.out.printf("16���� : %x >> %x = %x \n",a,N,b);
		System.out.printf(" 2���� : 1001 1100 >> 2 \n");
		System.out.printf("     = 11 1001 11 = 1110 0111 \n");
	}

}

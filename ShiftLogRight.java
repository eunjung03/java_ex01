
public class ShiftLogRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 178, b, N =2;
		
		b = a >>> N; // ������ ����Ʈ
		
		System.out.printf(" 	10���� : %04d >>> %d = %04d \n",a,N,b);
		System.out.printf(" 	16���� : %04x >>> %x = %04x \n",a,N,b);
		System.out.printf("���� 1����Ʈ : 1011 0010 >>> 2 \n");
		System.out.printf("       = : 0010	1100 \n");
	}

}

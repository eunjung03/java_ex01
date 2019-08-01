
public class ShiftLogRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 178, b, N =2;
		
		b = a >>> N; // 오른쪽 시프트
		
		System.out.printf(" 	10진수 : %04d >>> %d = %04d \n",a,N,b);
		System.out.printf(" 	16진수 : %04x >>> %x = %04x \n",a,N,b);
		System.out.printf("하위 1바이트 : 1011 0010 >>> 2 \n");
		System.out.printf("       = : 0010	1100 \n");
	}

}

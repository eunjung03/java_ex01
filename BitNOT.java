
public class BitNOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a= -86, r;
		// r = ~a ; // ~a의 값을 byte형의 r에 대입 못함, 컴파일 에러
		// 바이트 단위 음수값을 가지고 있는 변수 -86 음수값 최소값이므로 반전해서 r에 대입 하지 못함
		
		System.out.printf(" a = %4d = %X = 1010 1010\n",a,a);
		System.out.printf("~a = %4d = %X = 0101 0101\n",~a,~a);	// 비트 NOT
		
		short t = (short)~a;	// 비트 NOT
		r = (byte)t;			// 하위 바이트만 r에 저장
		System.out.printf(" r = %4d = %X = 0101 0101\n",r,r);
	}

}

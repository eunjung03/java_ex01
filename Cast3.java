
public class Cast3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte a = 127;		// 0x7F
		short b = 32767;	// 0x7FFF
		
		System.out.println("a = " +a+ ", b = "+b);
		b = (short) a;		// b = 0x007F
		System.out.println("byte -> short : " +a+" -> "+b);
		
		b = 32767;		// b = 0x7FFF
		a = (byte) b;	// a = 0xFF : -1의 2의 보수표현
		System.out.println("short -> byte : " +b+" -> "+a);
	}

}

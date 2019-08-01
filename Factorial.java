
public class Factorial {

	public static long fact1(long n)	//for 루프를 사용한 메소드
	{
		long fact = 1;
		if (n==0) {
			return fact;
		}
		for(long i = 1; i<=n; i++) {
			fact *= i;
		}
		return fact;
	}
	public static long fact2(long n)	//재귀 호출을 사용한 메소드
	{
		if(n==0) { return 0; }
		return (n==1) ? 1 : n * fact2(n-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 5;
		long a = 7;
		long y1 = fact1(n);
		long y2 = fact2(a);
		System.out.println(n+"! = "+y1);
		System.out.println(a+"! = "+y2);
	}

}


public class Ex6_5 {
	public static long sum1(long n)
	{
		long sum = 0;
		for(int i = 1; i<=n; i++)
			sum += i;
		return sum;
	}
	public static long sum2(long n)
	{
		return (n==1) ? 1 : n + sum2(n-1); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n = 10;
		long result1 = sum1(n);
		long result2 = sum2(n);
		
		System.out.println("1부터 "+n+"까지의 합은 "+result1);
		System.out.println("1부터 "+n+"까지의 합은 "+result2);
	}

}


public class Calc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int count;
		
		for(count=2; count<=10; count+=2)
			sum += count;
		
		System.out.println("1~10 �� ¦���� ���� " + sum);
		
		sum = 0;
		
		for(count=1; count<=10; count+=2)
			sum += count;
		
		System.out.print("1~10 �� Ȧ���� ���� " + sum);
	}

}

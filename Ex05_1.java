
public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1 = 0, sum2 = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)
				sum2 += i;
			else
				sum1 += i;
		}
		System.out.println("1���� 10������ ¦���� ���� " +sum2);
		System.out.println("1���� 10������ Ȧ���� ���� " +sum1);
	}

}

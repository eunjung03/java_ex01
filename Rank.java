
public class Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		System.out.print(num+"�� ");
		
		if(0 <= num && num <= 9)
			System.out.println("1�ڸ� ���Դϴ�.");
		else if(10 <= num && num <= 99)
			System.out.println("2�ڸ� ���Դϴ�.");
		else if(100 <= num && num <= 999)
			System.out.println("3�ڸ� ���Դϴ�.");
		else
			System.out.println("4�ڸ� �̻��� �� �Դϴ�.");
	}

}

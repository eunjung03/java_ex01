
public class Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		System.out.print(num+"은 ");
		
		if(0 <= num && num <= 9)
			System.out.println("1자리 수입니다.");
		else if(10 <= num && num <= 99)
			System.out.println("2자리 수입니다.");
		else if(100 <= num && num <= 999)
			System.out.println("3자리 수입니다.");
		else
			System.out.println("4자리 이상의 수 입니다.");
	}

}

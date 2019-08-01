public class Select2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a = 5; a <=8; a++) {
			System.out.print(a + " / 3 = "+ a/3);
			
			if(a%3 == 1) 
				System.out.println(" 나머지는 1입니다");
			else if(a%3 == 2)
				System.out.println(" 나머지는 2입니다");
			else
				System.out.println(" 나머지는 0입니다");
			}
	}
}

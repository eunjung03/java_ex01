
public class Select1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int a = 5; a <=8; a++) {
			System.out.print(a + " / 3 = "+ a/3);
			
			switch(a%3) {
			case 1 :
				System.out.println(" �������� 1�Դϴ�");
				break;
			case 2 :
				System.out.println(" �������� 2�Դϴ�");
				break;
			default :
				System.out.println(" �������� 0�Դϴ�");
				break;
			}
		}
	}

}

import java.util.Scanner;
public class Bissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	// Ű�����Է��Ҷ� Scanner ��ü��
		int yr;
		boolean A, B, C, Y1, Y2;
		
		System.out.println("������ �Է��Ͻÿ�.");
		yr = sc.nextInt();		// nextInt() �빮�� I��
		
		A = (yr % 4) == 0;
		B = (yr % 100) == 0;
		C = (yr % 400) == 0;
		
		Y1 = (A && !B && !C) || (A && !B && C) || (A && B && C);
		Y2 = (A && !B) || (A && C);
		
		System.out.println(yr + "���� �����ΰ�?" + Y1 );
		System.out.println(yr + "���� �����ΰ�?" + Y2 );
	}

}

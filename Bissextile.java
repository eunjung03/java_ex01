import java.util.Scanner;
public class Bissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	// 키보드입력할때 Scanner 객체씀
		int yr;
		boolean A, B, C, Y1, Y2;
		
		System.out.println("연도를 입력하시오.");
		yr = sc.nextInt();		// nextInt() 대문자 I임
		
		A = (yr % 4) == 0;
		B = (yr % 100) == 0;
		C = (yr % 400) == 0;
		
		Y1 = (A && !B && !C) || (A && !B && C) || (A && B && C);
		Y2 = (A && !B) || (A && C);
		
		System.out.println(yr + "년은 윤년인가?" + Y1 );
		System.out.println(yr + "년은 윤년인가?" + Y2 );
	}

}

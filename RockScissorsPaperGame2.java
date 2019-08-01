import java.util.*;
public class RockScissorsPaperGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		boolean SR = false, SS = false, SP = false;
		boolean CR = false, CS = false, CP = false;
		boolean SWin = false, CWin = false, Even = false;
		
		int student, computer;
		
		System.out.print("바위는 1, 가위는 2, 보는 3을 입력하세요 : ");
		student = input.nextInt();
		computer = (int)((Math.random() * 10) % 3 + 1);
		
		switch(student) {
			case 1:
				System.out.println("학생은 바위를 선택했습니다.");
				SR = true;
				break;
			case 2:
				System.out.println("학생은 가위를 선택했습니다.");
				SS = true;
				break;
			case 3:
				System.out.println("학생은 보를 선택했습니다.");
				SP = true;
				break;
		}
		
		switch(computer) {
		case 1:
			System.out.println("컴퓨터는 바위를 선택했습니다.");
			CR = true;
			break;
		case 2:
			System.out.println("컴퓨터는 가위를 선택했습니다.");
			CS = true;
			break;
		case 3:
			System.out.println("컴퓨터는 보를 선택했습니다.");
			CP = true;
			break;
	}
		
		SWin = (SR && CS) || (SS && CP) || (SP && CR);	//학생승리
		CWin = (SR && CP) || (SS && CR) || (SP && CS); 	//컴퓨터승리
		Even = (SR && CR) || (SS && CS) || (SP && CP);	//비김
		
		if(Even == true)
			System.out.println("비겼습니다.");
		else{
			if(SWin == true)
				System.out.println("학생이 이겼습니다.");
			else
				System.out.println("컴퓨터가 이겼습니다.");
		}
	}
}

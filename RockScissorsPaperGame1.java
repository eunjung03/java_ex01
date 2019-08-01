import java.util.*;
public class RockScissorsPaperGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		final int ROCK = 1, SCISSORS	= 2, PAPER	= 3;
		
		int student, computer;
		
		System.out.print("바위는 1, 가위는 2, 보는 3을 입력하세요 : ");
		student = input.nextInt();
		computer = (int)((Math.random() * 10) % 3 + 1);	//랜덤값 발생
		
		switch(student) {
			case 1:
				System.out.println("학생은 바위를 선택했습니다.");
				break;
			case 2:
				System.out.println("학생은 가위를 선택했습니다.");
				break;
			case 3:
				System.out.println("학생은 보를 선택했습니다.");
				break;
		}
		
		switch(computer) {
		case 1:
			System.out.println("컴퓨터는 바위를 선택했습니다.");
			break;
		case 2:
			System.out.println("컴퓨터는 가위를 선택했습니다.");
			break;
		case 3:
			System.out.println("컴퓨터는 보를 선택했습니다.");
			break;
		}
		
		if(student == computer)
			System.out.println("비겼습니다.");
		else
			if(student == 1)
				if(computer == 2)
					System.out.println("학생이 이겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
			else
				if(student == 2)
					if(computer == 1)
						System.out.println("컴퓨터가 이겼습니다.");
					else
						System.out.println("학생이 이겼습니다.");
				else
					if(computer == 1)
						System.out.println("학생이 이겼습니다.");
					else
						System.out.println("컴퓨터가 이겼습니다.");
	}

}

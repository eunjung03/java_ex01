import java.util.*;
public class RockScissorsPaperGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		final int ROCK = 1, SCISSORS	= 2, PAPER	= 3;
		
		int student, computer;
		
		System.out.print("������ 1, ������ 2, ���� 3�� �Է��ϼ��� : ");
		student = input.nextInt();
		computer = (int)((Math.random() * 10) % 3 + 1);	//������ �߻�
		
		switch(student) {
			case 1:
				System.out.println("�л��� ������ �����߽��ϴ�.");
				break;
			case 2:
				System.out.println("�л��� ������ �����߽��ϴ�.");
				break;
			case 3:
				System.out.println("�л��� ���� �����߽��ϴ�.");
				break;
		}
		
		switch(computer) {
		case 1:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�.");
			break;
		case 2:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�.");
			break;
		case 3:
			System.out.println("��ǻ�ʹ� ���� �����߽��ϴ�.");
			break;
		}
		
		if(student == computer)
			System.out.println("�����ϴ�.");
		else
			if(student == 1)
				if(computer == 2)
					System.out.println("�л��� �̰���ϴ�.");
				else
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			else
				if(student == 2)
					if(computer == 1)
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					else
						System.out.println("�л��� �̰���ϴ�.");
				else
					if(computer == 1)
						System.out.println("�л��� �̰���ϴ�.");
					else
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
	}

}

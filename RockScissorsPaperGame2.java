import java.util.*;
public class RockScissorsPaperGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		boolean SR = false, SS = false, SP = false;
		boolean CR = false, CS = false, CP = false;
		boolean SWin = false, CWin = false, Even = false;
		
		int student, computer;
		
		System.out.print("������ 1, ������ 2, ���� 3�� �Է��ϼ��� : ");
		student = input.nextInt();
		computer = (int)((Math.random() * 10) % 3 + 1);
		
		switch(student) {
			case 1:
				System.out.println("�л��� ������ �����߽��ϴ�.");
				SR = true;
				break;
			case 2:
				System.out.println("�л��� ������ �����߽��ϴ�.");
				SS = true;
				break;
			case 3:
				System.out.println("�л��� ���� �����߽��ϴ�.");
				SP = true;
				break;
		}
		
		switch(computer) {
		case 1:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�.");
			CR = true;
			break;
		case 2:
			System.out.println("��ǻ�ʹ� ������ �����߽��ϴ�.");
			CS = true;
			break;
		case 3:
			System.out.println("��ǻ�ʹ� ���� �����߽��ϴ�.");
			CP = true;
			break;
	}
		
		SWin = (SR && CS) || (SS && CP) || (SP && CR);	//�л��¸�
		CWin = (SR && CP) || (SS && CR) || (SP && CS); 	//��ǻ�ͽ¸�
		Even = (SR && CR) || (SS && CS) || (SP && CP);	//���
		
		if(Even == true)
			System.out.println("�����ϴ�.");
		else{
			if(SWin == true)
				System.out.println("�л��� �̰���ϴ�.");
			else
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
	}
}

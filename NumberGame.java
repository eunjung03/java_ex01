// ���� : java NumberGame
import java.io.*;


public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {	//System.in�� Ű���� �Է��� �� ���
		InputStreamReader key = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(key);
		
		int a, b=7;
		System.out.println("�̸��� �Է��ϼ���.");
		String name = in.readLine(); 	//Ű����κ��� ���ڿ� �Է�
		
		System.out.println("���� ���߱� ����! 0~9 ������ ���ڸ� �Է��ϼ���.");
		String c = in.readLine(); 	//Ű����κ��� ���ڿ� �Է�
		a = Integer.parseInt(c);	//���ڸ� ������ ��ȯ
		
		while(a !=b ) {
			if((a == b-1)||(a == b+1))
				System.out.println("�Ʊ����ϴ�~");
			else if(a > b+1)
				System.out.println("�� �� ���� �� �Դϴ�.");
			else if(a < b-1)
				System.out.println("�� �� ū �� �Դϴ�.");
			
			c = in.readLine(); 	//Ű����κ��� ���ڿ� �Է�
			a = Integer.parseInt(c);	//���ڸ� ������ ��ȯ
		}
		System.out.println("����!! "+name+"�� �����մϴ�!!");
 	}
	catch(IOException e) {
		System.out.println("�����Դϴ�.");
	}
}

}

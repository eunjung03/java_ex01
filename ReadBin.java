// ���� : java ReadBin filename
import java.io.*;

public class ReadBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream in = new FileInputStream(args[0]);	//���Ͽ���
			int c;
			String s = new String();
			while((c = in.read()) != -1)	//���Ϸκ��� 1����Ʈ �б�
				s = s + (char) c;			//�Է� ���ڸ� s�� �߰�
			System.out.print(s);
			in.close();						//���ϴݱ�
		}
		catch(FileNotFoundException e) {	//IOException�� ����Ŭ����
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(Exception e) {	
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}

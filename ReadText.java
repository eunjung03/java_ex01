// ���� : java ReadText filename

import java.io.*;

public class ReadText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader in = new FileReader(args[0]);	//���Ͽ���
			int c;
			String s = new String();
			while((c = in.read()) != -1)	//���Ϸκ��� ������ �б�
				s = s + (char) c;			//�Է� ���ڸ� s�� �߰�
			System.out.print(s);
			in.close(); 					//���� �ݱ�
		}
		catch(IOException ie) {	//������ ���°��
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(Exception e) {	//������ �������� �ʾ�����
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
	}

}

//���� : java ReadBin2B filename
import java.io.*;

public class ReadBin2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//���̳ʶ� ���� ����
			FileInputStream in = new FileInputStream(args[0]);
			int c;
			while((c = in.read()) != -1)	//���Ϸκ��� 1����Ʈ �б�
				System.out.printf("%02X ",c);	//16������ ȭ�鿡 ���
			in.close();
		}
		catch(IOException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
	}

}

// ���� : java WriteBin Filename
import java.io.*;

public class WriteBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream out = new FileOutputStream(args[0]);	//���Ͽ���
			byte x;
			
			for(x = 48; x <= 57; x++)	//���� 0~9
				out.write(x); 	//���Ͽ� 1����Ʈ ����(ASCII �ڵ�)
			out.write('\n');
			for(x = 65; x <= 90; x++)	//���� �빮�� A~Z(ASCII �ڵ�)
				out.write(x);
			
			out.close(); 	//���� �ݱ�
		}
		catch(Exception e) {
		System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
	}

}

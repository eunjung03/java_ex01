// ���� : java InOut1 filename
import java.io.*;

public class InOut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = args[0];
			//���̳ʸ� ������� ����
			FileOutputStream out = new FileOutputStream(filename);
			//���̳ʸ� �Է����� ����
			FileInputStream file = new FileInputStream(filename);
			// ���̳ʸ� �Է� -> ����
			InputStreamReader in = new InputStreamReader(file);
			
			for(byte i = 1; i <= 10; i++)
				out.write(i);	//���Ͽ� ���̳ʸ�(1����Ʈ) ������ ����
								//2����Ʈ ���ڸ� �ᵵ 1����Ʈ�� �����
			out.close(); 		//���ϴݱ�
			
			int c;
			while((c = in.read()) != -1)	//���̳ʸ� �����͸� �о� ���ڷ� ��ȯ
				System.out.print(c+" ");	
			//InputStreamReder�� �̿��߱⿡ ȭ�鿡 ���ڰ� ����� ��µ�
			
			in.close(); 		//���ϴݱ�
		}
		catch(Exception e) {
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
	}

}

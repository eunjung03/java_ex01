// ���� : java InOut2 filename
import java.io.*;

public class InOut2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String filename = args[0];
			// ���̳ʸ� ������� ����
			FileOutputStream fout = new FileOutputStream(filename);
			// ���̳ʸ� ��� -> �������
			OutputStreamWriter out = new OutputStreamWriter(fout); 
			
			String han = "���� ��Ʈ������ ��ȯ�ϱ� OutputStreamWriter Ŭ����";
			out.write(han);	//���Ͽ� ���̳ʸ� ������(���ڿ�) ����
			// OutputStreamWriter�� ������� �ʾҴٸ� ���ڿ��� ���̳ʸ� ���Ͽ� �� �� ����
			
			out.close();	//���ϴݱ�
		}
		catch(Exception e)
		{
			System.out.println("������ �������� �ʾҽ��ϴ�");
		}
	}

}

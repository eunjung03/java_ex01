// ���� : java TransWord ���ڿ�
import java.io.*;

public class TransWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//�ؽ�Ʈ ���Ϸκ��� �Է��� �ޱ� ���� ������Ʈ ����
			FileReader fin =new FileReader("mydic.txt");
			//�� ������ �����͸� �б� ���� ������Ʈ ����
			BufferedReader in = new BufferedReader(fin);
			
			String a = args[0]; 	//ã�� ���ڿ�
			
			String eword, kword = null;
			
			while((eword = in.readLine()) != null) {
				if(a.equals(eword)) { //ã�� ���ڿ��� �Է� ���ڿ� ��
					kword = in.readLine();
					break;
				}
			}
			if(kword == null)
				System.out.println(a+"�̶�� �ܾ�� �����ϴ�.");
			else
				System.out.println(kword);
			
			in.close();
		}
		catch(Exception e){
			System.out.println("Ŀ�ǵ���� �μ��� �����ϴ�.");
		}
	}

}

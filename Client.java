// ��� �� : java Client �����ּ� ��Ʈ��ȣ
import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String server = args[0];
		int port = Integer.parseInt(args[1]);
		Socket csocket = new Socket(server, port); //Ŭ���̾�Ʈ ���ϻ���(������ �����û)
		InputStream istream = csocket.getInputStream(); //���� �Է� ��Ʈ�� ����
		DataInputStream distream = new DataInputStream(istream); //��Ʈ�� ��ȯ
		
		for(int i=1; i<=5; i++) {
			int imsg = distream.readInt(); //������ ����
			System.out.println("�����κ��� ���� ������ : "+imsg);
		}
		csocket.close();
	}

}

//��� �� : java Server ��Ʈ��ȣ

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int port = Integer.parseInt(args[0]);
		ServerSocket ssocket = new ServerSocket(port); //���� ���� ����
		
		System.out.println("���� ���� ��...");
		while(true) {
			Socket csocket = ssocket.accept(); //�������, Ŭ���̾�Ʈ ���� ����
			OutputStream ostream = csocket.getOutputStream(); //���� ��� ��Ʈ�� ����
			DataOutputStream dostream = new DataOutputStream(ostream); //��Ʈ�� ��ȯ
			
			for(int imsg = 1; imsg <= 5; imsg++)
				dostream.writeInt(imsg); //������ ����
			
			csocket.close();
		}

	}

}

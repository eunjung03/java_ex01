//��� �� : java UDPServer �ּ� ��Ʈ��ȣ
import java.io.*;
import java.net.*;

public class UDPServer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	DatagramSocket ds = new DatagramSocket(); //���� ����
	InetAddress ia = InetAddress.getByName(args[0]); //�ּһ���
	int port = Integer.parseInt(args[1]);	//��Ʈ ��ȣ
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("������ �޼����� �Է��ϼ���(�������� bye �Է�)");
	String buf;
	
	do {
		buf = in.readLine(); 	//Ű����κ��� �� �� �Է�
		byte buffer[] = buf.getBytes(); 	//����Ʈ �迭�� ��ȯ
		DatagramPacket dp = new DatagramPacket(buffer,buffer.length,ia,port); //��Ŷȭ
		ds.send(dp); //����
	}while(!buf.contentEquals("bye"));
	
	ds.close();
	}

}

// ��� �� : java UDPClient ��Ʈ��ȣ
import java.net.*;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int port = Integer.parseInt(args[0]);
		DatagramSocket ds = new DatagramSocket(port); //���� ����
		String q;
		
		do {
			byte buffer[] = new byte[60];
			//��Ŷ ������Ʈ ����
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
			
			ds.receive(dp); //��Ŷ ����
			String msg = new String(dp.getData()); //����Ʈ �迭�� ���ڿ��� ��ȣ��
			System.out.println("���� �޼��� : "+msg);
			
			q = msg.substring(0,3);
		}while(!q.contentEquals("bye"));
		
		ds.close(); //���� ����
	}

}

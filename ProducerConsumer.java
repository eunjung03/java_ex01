//������vs�Һ��� ���� ���α׷�
//������ ������� â��(����)�� �����͸� �����ϰ�, �Һ��� ������� â��κ��� �����͸� ������

class pcBuffer{
	private int contents;
	private boolean available = false; 	//������ ���� �÷���
	
	public synchronized void put(int value) { //�Ӱ迵��
		while(available == true) {
			System.out.println("â�� á��. ������ : ��� ");
		try {
			wait(); 	//�ٸ� �����忡�� notify()�� ������ �� ������ ���
			}
		catch(InterruptedException e) { /*nothing*/ }
	}
	contents = value;
	System.out.println("������ : ���� "+contents);
	notify(); //��� ������ �����忡�� ��ȣ�� ����
	available = true; //â�� ������ ������ �˸�
	}
	public synchronized int get() {
		while(available == false) {
			System.out.println("â�� �����. �Һ��� : ���");
			try {
				wait(); //�ٸ� �����忡�� notify()�� ������ �� ������ ���
			}
			catch(InterruptedException e) { /*nothing*/ }
		}
		System.out.println("�Һ��� : �Һ� "+contents);
		notify(); //��� ������ �����忡�� ��ȣ�� ����
		available = false; //â�� ������ ������ �˸�
		return contents;
	}
}
class Producer extends Thread{
	private pcBuffer b;
	public Producer(pcBuffer blank) { //������
		b = blank; //�Ӱ迵���� �����
	}
	public void run() {
		for(int i=1; i<=5; i++)
			b.put(i); //�Ӱ迵���� �����͸� ����
	}
}
class Consumer extends Thread{
	private pcBuffer b;
	public Consumer(pcBuffer blank) { //������
		b = blank; //�Ӱ迵���� �����
	}
	public void run() {
		int value = 0;
		for(int i=1;i<=5; i++)
			value = b.get(); //�Ӱ迵���� �����͸� ������
	}
}
public class ProducerConsumer {
	public static void main(String[] args) {
		pcBuffer buff = new pcBuffer(); //�Ӱ迵�� ���� ������Ʈ ����
		Producer pro = new Producer(buff); //������Ʈ����(�Ӱ迵�� ����)
		Consumer con = new Consumer(buff); //������Ʈ����(�Ӱ迵�� ����)
		
		pro.start(); //������ ������ ����
		con.start(); //�Һ��� ������ ����

	}

}

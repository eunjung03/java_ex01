class DaeA extends Thread{
	public void run() {
		System.out.println("Daemon Thread A ����");
		try {
			Thread.sleep(700); //time �и��ʸ�ŭ ���� ������ ���
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("Daemon Thread DaeA ��");
	}
}
class DaeB extends Thread{
	public void run() {
		System.out.println("���� Thread DaeB ����");
		try {
			Thread.sleep(10000); //time �и��ʸ�ŭ ���� ������ ���
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("���� Thread DaeB ��");
	}
}
public class DaemonInde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main Thread ����");
		
		DaeA threadA = new DaeA();
		DaeB threadB = new DaeB();
		
		threadA.setDaemon(true); //���� ������� ������
		threadB.setDaemon(false); //���� ������� ������
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(500); //time�и��ʸ�ŭ ���� ������ ���
		}
		catch(Exception e) {
			//nothing
		}
		System.out.println("main Thread ��");
	}

}

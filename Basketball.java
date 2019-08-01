class Point{
	private int total = 0;
	synchronized void goalin(int point) { //�Ӱ迵��
		total += point;
	}
	int gettotal() {
		return total;
	}
}
class Player extends Thread{
	Point goal;	//�Ӱ迵���� ���� ���� �� ��
	Player(Point number){
		goal = number;	//�Ӱ迵���� �����
	}
	public void run() {
		try {
			for(int n=0; n<100; n++) {
				int pt = (int)(Math.random()*10)%3+1; 	//��������
				goal.goalin(pt); //�Ӱ迵���� ���� ����
				System.out.println("����("+getName()+") = "+pt+"��");
				
				int sleep_time = (int)(Math.random()*10);
				sleep(sleep_time);	//�ٸ� ������ ������ ���� ��� ���
				if(goal.gettotal() >= 20) break; //���� ����
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class Basketball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point jeomsu = new Point(); //�Ӱ迵�� ���� ������Ʈ ����
		Player [] seonsu = new Player[5]; //�迭����
		for(int n=0; n<5; n++) {
			seonsu[n] = new Player(jeomsu); //������Ʈ����(�Ӱ迵�� ����)
			seonsu[n].start(); //������ ����
		}
		for(int n=0; n<5; n++) {
			try {
				seonsu[n].join(); //��� ������ ���Ḧ ���
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�� ������ : "+jeomsu.gettotal()+"��");
	}

}

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner src = new Scanner(System.in);
		
		System.out.println("�� �̸��� �Է��ϼ���.");
		String stationName = src.next();	//�����͸� ���ڿ��� �����´�.
		System.out.println("�÷��� ��ȣ�� �Է��ϼ���.");
		int num = src.nextInt(); 	//�����͸� ������ �����´�.
		
		src.close();
		
		System.out.println(stationName + "�� "+num+"�� Ȩ�Դϴ�.");
	}

}

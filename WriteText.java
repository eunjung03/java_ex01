// ���� : java WriteText filename

import java.io.*;

public class WriteText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter out = new FileWriter(args[0]);	//���� ����
			int a = 10, b = 5;
			out.write("����: ");	//���Ͽ� ���ڿ� ����
			out.write(a+" + "+b+" = "+(a+b)+"\n");
			out.write("����: ");	
			out.write(a+" - "+b+" = "+(a-b)+"\n");
			
			out.close();	//���� �ݱ�
		}
		catch(Exception e) {
			System.out.println("������ �������� �ʾҽ��ϴ�.");
		}
	}

}

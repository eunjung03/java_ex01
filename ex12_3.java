//���⿡ �־��� ���ڿ��� �����, ���� ����� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�
//StringTokenizer Ŭ������ �̿��Ͻÿ�.
//���� : �������ι�, ���ڿͷ�, ����, �����, �ƴ��Ҽ�, ��ο�, �޾�
//��� : �������ι� ��ο� �޾� ���ڿͷ� ���� ����� �ƴ��Ҽ�

import java.util.*;

public class ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "�������ι�,���ڿͷ�,����,�����,�ƴ��Ҽ�,��ο�,�޾�";
		String word[] = new String[7];
		int n = 0;
		
		StringTokenizer t = new StringTokenizer(src,",");
		while(t.hasMoreTokens()) {
			word[n] = t.nextToken();
			n++;
		}
		System.out.print(word[0]+" "+word[5]+" "+word[6]+" ");
		System.out.println(word[1]+" "+word[2]+" "+word[3]+" "+word[4]);
	}

}

import java.util.*;

public class AListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> alist = new ArrayList <String> ();
		String a = "A", b = "B", c="C";
		String d = "X";
		
		alist.add(a); alist.add(b); alist.add(c);
		System.out.println(alist); //����Ʈ�� ��� ��½� []�� �ڵ����� ��µ�
		
		alist.add(2,d);
		System.out.println(alist);
		
		Collections.sort(alist); //Collections Ŭ������ sort �޼ҵ�
		System.out.println(alist);//��Ҹ� ������.���ĺ�������� ���ĵ�
	}

}

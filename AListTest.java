import java.util.*;

public class AListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> alist = new ArrayList <String> ();
		String a = "A", b = "B", c="C";
		String d = "X";
		
		alist.add(a); alist.add(b); alist.add(c);
		System.out.println(alist); //리스트의 요소 출력시 []가 자동으로 출력됨
		
		alist.add(2,d);
		System.out.println(alist);
		
		Collections.sort(alist); //Collections 클래스의 sort 메소드
		System.out.println(alist);//요소를 정렬함.알파벳순서대로 정렬됨
	}

}

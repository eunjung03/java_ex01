import java.util.*;
public class Keyboard_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner jv = new Scanner(System.in);
		String name;
		int age;
		
		
		System.out.println("�̸��� ���̸� �Է��ϼ���.");
		
		name = jv.next();
		age = jv.nextInt();
		
		System.out.println(name+"�� ���� �̸��Դϴ�.");
		System.out.println(age+"���� �ڹٸ� �����ϱ� ���� �����Դϴ�.");
	}

}

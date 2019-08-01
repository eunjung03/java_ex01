import java.util.*;
public class Keyboard_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner jv = new Scanner(System.in);
		String name;
		int age;
		
		
		System.out.println("이름과 나이를 입력하세요.");
		
		name = jv.next();
		age = jv.nextInt();
		
		System.out.println(name+"은 멋진 이름입니다.");
		System.out.println(age+"세는 자바를 공부하기 좋은 나이입니다.");
	}

}

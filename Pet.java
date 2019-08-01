class Cat{
	String name;
	String place;
	int age;
	
	void setData(String n , String p, int a) {
		name = n;
		place = p;
		age = a;
	}
	void print() {
		System.out.println(place+": "+name+" "+age+"살");
	}
	void print(String p, int a) {
		place = p;
		System.out.println(place+": 고양이는 "+a+"마리입니다.");
	}
	void print(String variety) {
		System.out.println(place+": "+name+" "+age+"세 "+variety);
	}
}
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		
		cat1.setData("로빈", "우리집", 10);
		cat2.setData("아이", "옆 집", 14);
		
		cat1.print("잡종");			//인자가 한 개인 print 메소드 호출
		cat2.print();				//인자가 없는 print 메소드 호출
		cat3.print("아랫집", 0);		//인자가 두 개인 print 메소드 호출
	}

}

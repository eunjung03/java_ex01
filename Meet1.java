interface Greet{
	void greet();	//public abstract void greet();
}
interface Talk{
	void talk();	//public abstract void talk();
}
class Morning implements Greet, Talk{
	public void greet() {
		System.out.println("안녕하세요!");
	}
	public void talk() {
		System.out.println("날씨가 좋네요.");
	}
}
public class Meet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning mn = new Morning();
		mn.greet();
		mn.talk();
	}

}

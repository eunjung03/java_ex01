class Calc{
	int add(int a, int b) {
		return a+b ;
	}
	void print() {
		int c;
		c = add(8,6);
		System.out.println("c = "+c);
	}
}
public class Method7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc x = new Calc();
		
		x.print();
	}

}

class E6_1{
	int a = 5;
	int b = 3;
	
	int sum(int a, int b) {
		int x;
		x = a + b;
		return x;
	}
	float average(int a, int b) {
		float x;
		x = (a+b)/2;
		return x;
	}
}
public class Ex6_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E6_1 obj = new E6_1();
		System.out.println(obj.sum(obj.a, obj.b));
		System.out.println(obj.average(obj.a, obj.b));
	}

}


class staticB {
	//private int b=1;	//에러; private static int b = 1; 수정
	private static int b = 1;
	static int get() {
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticB b = new staticB();
		System.out.println("b.b = "+b.get());
	}

}

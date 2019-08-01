class Coffee{
	void print1(){
		System.out.println("Jamaica");
	}
	static void print2(){
		System.out.println("Vietnam");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee ob = new Coffee();
		ob.print1();
		ob.print2();	//객체를 통해서 static 메소드 호출 가능
	 // print1();	동일 클래스 내에 있지만 static이 아니어서 객체없이 호출 못함. 컴파일 에러
		print2();
	}
}

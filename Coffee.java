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
		ob.print2();	//��ü�� ���ؼ� static �޼ҵ� ȣ�� ����
	 // print1();	���� Ŭ���� ���� ������ static�� �ƴϾ ��ü���� ȣ�� ����. ������ ����
		print2();
	}
}

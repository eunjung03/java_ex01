class Book{
	String title;
	int price;
	int num;
	
	int sum() {
		return (price * num);
	}
}		// Ŭ���� ����
public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		
		System.out.println("Book Ŭ������ ������Ʈ book1 ���� ����");
		
		System.out.println("book1.title = "+book1.title);
		System.out.println("book1.price = "+book1.price);
		System.out.println("book1.num = "+book1.num);
	}

}

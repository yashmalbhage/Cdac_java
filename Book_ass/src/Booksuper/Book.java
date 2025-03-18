package Booksuper;

public class Book {
	private int book_id;
	private int price;
	private String title;
	public Book(int book_id, int price, String title) {
		super();
		this.book_id = book_id;
		this.price = price;
		this.title = title;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("Details about book : ");
		System.out.println("book id - "+book_id);
		System.out.println("Title - "+title);
		System.out.println("Price - "+price);
		
		
	}
	

}

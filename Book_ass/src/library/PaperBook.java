package library;

import Booksuper.Book;
import basic.Date;

public class PaperBook extends Book{
	private int noOfPages;
	private Date dateOfPublication;
	
	public PaperBook(int book_id, int price, String title, int noOfPages,int d, int m, int y) {
		super(book_id, price, title);
		this.noOfPages = noOfPages;
		this.dateOfPublication = new Date(d,m,y);
	}

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void diplay() {
		super.display();
		System.out.println("No of pages in books - "+noOfPages);
		System.out.print("Date of publication ");
		dateOfPublication.display();
	}

}

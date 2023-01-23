package arraylist;

import java.util.ArrayList;

public class Book {
	
	String bookName;
	String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;	
	}
	
	public void showBookInfo() {
		System.out.println(bookName + ", " + author);
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥", "조정래"));
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("어떻게 살 것인가", "유시민"));
		library.add(new Book("토지", "박경리"));
		library.add(new Book("어린왕자", "생택쥐페리"));
		
		for(Book book: library) {
			book.showBookInfo();
		}

	}

}

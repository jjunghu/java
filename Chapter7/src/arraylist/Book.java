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
		
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣���켼"));
		library.add(new Book("��� �� ���ΰ�", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		for(Book book: library) {
			book.showBookInfo();
		}

	}

}

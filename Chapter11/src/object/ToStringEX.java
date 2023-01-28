package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + "," + author;
	}
}

public class ToStringEX {

	public static void main(String[] args) {
		
		Book book = new Book("자바자바", "달구");
		System.out.println(book);

	}

}

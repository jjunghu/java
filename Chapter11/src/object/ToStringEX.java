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
		
		Book book = new Book("�ڹ��ڹ�", "�ޱ�");
		System.out.println(book);

	}

}

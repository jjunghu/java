package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("?¹?????", "??????");
		bookArray1[1] = new Book("? ????", "???????丮");
		bookArray1[2] = new Book("??????", "??????");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();	
		}
		
		bookArray1[0].setBookName("????");
		bookArray1[0].setAuthor("?ڿϼ?");
		
		System.out.println("==================");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("==================");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}

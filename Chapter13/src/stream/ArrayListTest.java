package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> sList = new ArrayList<String>();
		sList.add("ÀÌÁöÀº");
		sList.add("±è¾Æ¿µ");
		sList.add("À±½Ã¿­");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		/*for(String s: sList) {
			System.out.println(s);
		}*/
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		}

}

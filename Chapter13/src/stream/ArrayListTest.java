package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> sList = new ArrayList<String>();
		sList.add("������");
		sList.add("��ƿ�");
		sList.add("���ÿ�");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		/*for(String s: sList) {
			System.out.println(s);
		}*/
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		}

}

package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		boolean aaa = set.add("aaa");
		System.out.println(aaa);
		
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
		
		boolean aaa2 = set.add("aaa");
		System.out.println(aaa2);
		System.out.println(set);
	}

}

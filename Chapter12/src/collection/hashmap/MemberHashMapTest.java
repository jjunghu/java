package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap hashMap = new MemberHashMap();
		
		Member member101 = new Member(101, "ÀÌÁöÀº");
		Member member102 = new Member(102, "±èÁ¤Çö");
		Member member103 = new Member(103, "À±¾Æ¿µ");
		
		hashMap.addMember(member101);
		hashMap.addMember(member102);
		hashMap.addMember(member103);
		
		hashMap.showAll();
		
		System.out.println("=========================");
		
		hashMap.removeMember(102);
		hashMap.showAll();

	}

}

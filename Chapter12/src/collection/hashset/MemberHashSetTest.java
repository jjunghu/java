package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	
	public static void main(String[] args) {
		
		MemberHashSet hashSet = new MemberHashSet();
		
		Member member101 = new Member(101, "이지은");
		Member member102 = new Member(102, "김한나");
		Member member103 = new Member(103, "장수지");
		
		hashSet.addMember(member101);
		hashSet.addMember(member102);
		hashSet.addMember(member103);
		
		hashSet.showAll();
		
		System.out.println("=================");
		
		Member member1010 = new Member(101, "강지영");
		hashSet.addMember(member1010);
		hashSet.showAll();
	}

}

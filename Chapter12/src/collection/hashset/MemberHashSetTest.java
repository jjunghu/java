package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	
	public static void main(String[] args) {
		
		MemberHashSet hashSet = new MemberHashSet();
		
		Member member101 = new Member(101, "������");
		Member member102 = new Member(102, "���ѳ�");
		Member member103 = new Member(103, "�����");
		
		hashSet.addMember(member101);
		hashSet.addMember(member102);
		hashSet.addMember(member103);
		
		hashSet.showAll();
		
		System.out.println("=================");
		
		Member member1010 = new Member(101, "������");
		hashSet.addMember(member1010);
		hashSet.showAll();
	}

}

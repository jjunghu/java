package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		Member member102 = new Member(102, "이지은");
		Member member103 = new Member(103, "장한나");
		Member member101 = new Member(101, "김아영");
		
		treeSet.addMember(member102);
		treeSet.addMember(member103);
		treeSet.addMember(member101);
		
		treeSet.showAll();

	}

}

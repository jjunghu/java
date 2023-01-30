package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		Member member102 = new Member(102, "������");
		Member member103 = new Member(103, "���ѳ�");
		Member member101 = new Member(101, "��ƿ�");
		
		treeSet.addMember(member102);
		treeSet.addMember(member103);
		treeSet.addMember(member101);
		
		treeSet.showAll();

	}

}

package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberList = new MemberArrayList();
		
		Member member101 = new Member(101, "±èÁöÀº");
		Member member102 = new Member(102, "ÀÌÇÏ³ª");
		Member member103 = new Member(103, "ÇÑ»ç¶û");
		
		memberList.addMember(member101);
		memberList.addMember(member102);
		memberList.addMember(member103);
		
		memberList.showAll();
		
		System.out.println("================");
		
		memberList.removeMember(102);
		memberList.showAll();
	}

}

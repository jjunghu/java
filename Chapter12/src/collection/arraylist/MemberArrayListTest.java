package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberList = new MemberArrayList();
		
		Member member101 = new Member(101, "������");
		Member member102 = new Member(102, "���ϳ�");
		Member member103 = new Member(103, "�ѻ��");
		
		memberList.addMember(member101);
		memberList.addMember(member102);
		memberList.addMember(member103);
		
		memberList.showAll();
		
		System.out.println("================");
		
		memberList.removeMember(102);
		memberList.showAll();
	}

}

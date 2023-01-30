package collection;

public class Member implements Comparable<Member>{
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName){
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
	}

	@Override
	public int hashCode() {
		return memberID;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			
			if(this.memberID == member.memberID) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		return (this.memberID - member.memberID);                 // 원래 있던 memberID를 기준으로 새로 들어오는 memberID 비교 (오름차순)
		/* return (this.memberID - member.memberID) * (-1);       // memberID를 기준으로 내림차순 정렬
		 * return (this.memberName.compareTo(member.memberName)   // memberName을 기준으로 오름차순
		 * return (this.memberName.compareTo(member.memberName) * (-1) // memberName을 기준으로 내림차순
		 */
	}
	
	
	
	

}

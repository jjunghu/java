package scheduler;

public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 순으로 고객의 정보를 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("상담 skill이 높은 상담원에게 할당합니다.");
	}

}

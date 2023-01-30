package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();

	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}
	
	public void showAll() {
		for(String q: arrayQueue) {
			System.out.println(q);
		}
		System.out.println();
	}
}

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		
		queue.showAll();
		
		queue.deQueue();
		queue.showAll();
		
		queue.deQueue();
		queue.showAll();
		

	}

}

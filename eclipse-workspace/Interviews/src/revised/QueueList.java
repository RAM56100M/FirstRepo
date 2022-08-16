package revised;
		//PEAK POLL OFFER
import java.util.LinkedList;
import java.util.Queue;

public class QueueList {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(1);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}

}

package stackANDqueue;

public class QueueMainClass {

	public static void main(String[] args) {
		
		//배열로 구현한 큐
		/*int queueSize = 5;
		ExArrayQueue myQueue = new ExArrayQueue(queueSize);
		
		myQueue.enQueue("A");
		myQueue.printQueue();
		System.out.println();
		
		myQueue.enQueue("B");
		myQueue.enQueue("C");
		myQueue.enQueue("D");
		myQueue.enQueue("E");
		myQueue.printQueue();
		System.out.println();
		
		myQueue.deQueue();
		myQueue.printQueue();*/
		
		//배열로 구현한 원형 큐
		int queueSize=4;
		ExArrayCicleQueue myQueue = new ExArrayCicleQueue(queueSize);
		
		myQueue.enQueue("A");
		myQueue.printQueue();
		System.out.println();
		
		myQueue.enQueue("B");
		myQueue.deQueue();
		myQueue.printQueue();
		System.out.println();
		
		myQueue.deQueue();
		myQueue.enQueue("C");
		myQueue.enQueue("D");
		myQueue.enQueue("E");
		myQueue.printQueue();
		
	}

}

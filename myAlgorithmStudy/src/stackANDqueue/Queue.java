package stackANDqueue;

public interface Queue {
	boolean isEmpty();
	void enQueue(String item);
	String deQueue();
	String peek();
}

package stackANDqueue;

public class ExArrayCicleQueue implements Queue {

	private int front;
	private int rear;
	private int queueSize;
	private String itemArray[];

	public ExArrayCicleQueue(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new String[queueSize];
	}

	// 큐가 비어있는지 확인
	public boolean isEmpty() {
		return (front == rear);
	}

	// 큐가 꽉차 있는지 확인
	public boolean isFull() {
		return ((rear+1) % this.queueSize == front);
	}

	public void enQueue(String item) {
		if(isFull()){
			System.out.println("큐가 꽉차 있음");
		}else{
			rear = (rear+1) % this.queueSize;
			itemArray[rear] = item;
			
		}

	}

	public String deQueue() {
		if(isEmpty()){
			return "큐가 비어 있음";
		}else{
			front = (front+1) % this.queueSize;
			return itemArray[front];
		}
		
	}

	public String peek() {
		if(isEmpty()){
			return "큐가 비어 있음";
		}else{
			return itemArray[(front+1) % this.queueSize];
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("큐가 비어 있음");
		}else{
			for(int i=(front+1) % this.queueSize; i!=(rear+1) % this.queueSize; i=++i % this.queueSize){
				//System.out.println("i = "+i);
				System.out.print(itemArray[i]);
			}
		}
	}

}

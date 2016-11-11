package stackANDqueue;

public class ExArrayQueue implements Queue{

	
	private int front;
	private int rear;
	private int queueSize;
	private String itemArray[];
	
	//큐 생성
	public ExArrayQueue(int queueSize){				//큐 생성하면서 배열 사이즈를 받아옴
		front = -1;
		rear = -1;
		this.queueSize =queueSize;
		itemArray = new String[queueSize];
	}
	
	//큐가 비어있는지 확인
	public boolean isEmpty() {
		return (front == rear);
	}

	//큐가 꽉차 있는지 확인
	public boolean isFull(){
		return (rear == itemArray.length-1);
	}
	
	
	public void enQueue(String item) {
		if(isFull()){
			System.out.println("큐가 꽉차 있음");
		}else{
			itemArray[++rear] = item;
		}
		
	}

	public String deQueue() {
		if(isEmpty()){
			return "큐가 비어 있음";
		}else{
			return itemArray[++front];
		}
	}

	
	public String peek() {
		if(isEmpty()){
			return "큐가 비어 있음";
		}else{
			return itemArray[front+1];
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("큐가 비어 있음");
		}else{
			for(int i=front+1; i<=rear;i++){
				System.out.print(itemArray[i]+" ");
			}
		}
	}

}

package stackANDqueue;

public class ExLinkedQueue implements Queue{

	QNode front;
	QNode rear;
	
	public ExLinkedQueue(){
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}

	public void enQueue(String item) {
		QNode newNode = new QNode();
		newNode.data=item;
		newNode.link=null;
		
		if(isEmpty()){
			front = newNode;
			rear = newNode;
		}else{
			rear.link=newNode;
			rear = newNode;
		}
	}

	
	public String deQueue() {
		if(isEmpty()){
			return "비어있음";
		}else{
			String item = front.data;
			front = front.link;
			if(front ==null){
				rear = null;
			}	
			
			return item;
			
		}
	}

	public String peek() {
		if(isEmpty()){
			return "비어있음";
		}else{
			return front.data;
		}
	}
	
	public void printQueue(){
		if(isEmpty()){
			System.out.println("큐가 비어 있음");
		}else{
			QNode temp = front;
			while(temp != null){
				System.out.print(temp.data + " ");
				temp = temp.link;
			}
		}
	}

}

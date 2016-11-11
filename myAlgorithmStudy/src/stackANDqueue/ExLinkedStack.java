package stackANDqueue;

public class ExLinkedStack implements Stack{

	private StackNode top;

	//스택이 비어있는지 체크
	//연결리스트로 스택을 구현하기때문에 꽉찬 상황은 발생 하지 않는다.
	public boolean isEmpty() {
		return  (top==null);
	}

	//데이터 삽입
	public void push(String item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		
		top = newNode;
	}


	public String pop() {
		if(isEmpty()){
			return "스택이 비어있음";
		}else{
			String item = top.data;
			top = top.link;
			return item;
		}
	}

	
	public String peek() {
		if(isEmpty()){
			return "스택이 비어있음";
		}else{
			return top.data;
		}
	}
	
	public void printStack(){
		if(isEmpty()){
			System.out.println("스택이 비어있음");
		}else{
			StackNode temp = top;
			while(temp != null){
				System.out.print(temp.data+" ");
				temp = temp.link;
			}
		}
	}
	
	
}

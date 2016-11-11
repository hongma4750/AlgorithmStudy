package stackANDqueue;

public class ExArrayStack {

	
	private int top;
	private int maxSize;
	private String itemArray[];
	
	public ExArrayStack(int maxSize){
		top = -1;
		this.maxSize = maxSize;		//생성할때 최대 크기 생성
		this.itemArray = new String[this.maxSize];		//생성하면서 배열 선언
	}
	
	
	// 스택이 비어있는지 체크
	public boolean isEmpty(){
        return (top == -1);
    }
    
    // 스택이 꽉찼는지 체크
    public boolean isFull(){
        return (top == maxSize-1);
    }
    
    //데이터 삽입
    public void push(String item){
    	if(isFull()){
    		System.out.println("스택이 꽉참");
    	}else{
    		itemArray[++top] = item;
    	}
    }
    
    //데이터 삭제
    public void pop(){
    	if(isEmpty()){
    		System.out.println("스택이 비어있음");
    	}else{
    		top--;
    	}
    }
    
    //데이터 읽기
    public String peek(){
    	if(isEmpty()){
    		System.out.println("스택이 비어있음");
    		return "0";
    	}else{
    		return itemArray[top];
    	}
    }
    
    //스택 전체 출력
    public void printStack(){
    	if(isEmpty()){
    		System.out.println("스택이 비어있음");
    	}else{
    		for(int i=0;i<=top;i++){
    			System.out.print(itemArray[i]+ " ");
    		}
    	}
    }
    
    
}

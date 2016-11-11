package stackANDqueue;

public class StackMainClass {

	public static void main(String[] args) {
		
		//배열로 구현한 스택
		/*int maxSize=5;
		ExArrayStack myStack = new ExArrayStack(maxSize);
		
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		myStack.push("E");
		
		//myStack.push("F");
		
		
		myStack.printStack();
		
		System.out.println(myStack.peek());
		
		
		myStack.pop();
		myStack.push("F");
		myStack.printStack();*/
		
		
		
		//연결리스트로 구현한 스택
		
		ExLinkedStack myStack = new ExLinkedStack();
		myStack.push("A");
		myStack.printStack();
		
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		myStack.push("E");
		myStack.push("F");
		
		myStack.printStack();
		
		myStack.pop();
		myStack.printStack();
		
		System.out.println();
		myStack.push("G");
		myStack.printStack();
		 
	}

}

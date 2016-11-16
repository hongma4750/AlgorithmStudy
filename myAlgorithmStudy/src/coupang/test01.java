package coupang;


public class test01 {

	public static void main(String args[]){
		
		String [] inputs = {"a","b","c","d","e","f","g","h"};
		
		String[] arr1 = null, arr2 = null, arr3 = null;
		
		if(inputs.length%3 == 0){
			arr1 = new String[inputs.length/3];
			arr2 = new String[inputs.length/3];
			arr3 = new String[inputs.length/3];
		}else if(inputs.length%3 == 1){
			arr1 = new String[(inputs.length/3)+1];
			arr2 = new String[inputs.length/3];
			arr3 = new String[inputs.length/3];
		}else if(inputs.length%3 == 2){
			arr1 = new String[(inputs.length/3)+1];
			arr2 = new String[(inputs.length/3)+1];
			arr3 = new String[inputs.length/3];
		}
		
		myQueue queue = new myQueue();
		
		for(int i=0;i<inputs.length;i++){
			queue.enqueue(inputs[i],i,arr1,arr2,arr3);
		}
		
		
		
		
		
	}
}

	class NodeQueue{
		String item;
		NodeQueue link;
	}
	
	class myQueue{
		NodeQueue front;
		NodeQueue rear;
		
		public myQueue(){
			front = null;
			rear = null;
		}
		
		public boolean isEmpty(){
			return (front == null);
		}
		
		public void enqueue(String item,int i, String[] arr1, String[] arr2, String[] arr3){
			NodeQueue newNode = new NodeQueue();
			newNode.item = item;
			newNode.link = null;
			
			
			if(i%3 == 0){
				
			}else if(i%3==1){
				
			}else if(i%3==2){
				
			}
			
			
			if(isEmpty()){
				front = newNode;
				rear = newNode;
			}else{
				rear.link = newNode;
				rear = newNode;
			}
			
		}

		public void printQueue(){
			if(isEmpty()){
				System.out.println("큐가 비어 있음");
			}else{
				NodeQueue temp = front;
				while(temp != null){
					System.out.print(temp.item + " ");
					temp = temp.link;
				}
			}
		}
	}

package UDP_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reversal {

	public static void main(String[] args) {
		
		List<Integer> myArr = new ArrayList<Integer>();
		myArr.add(0);
		
		for(int i=1;i<21;i++){
			myArr.add(i);
			//System.out.println(myArr.get(i-1));
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
	
			reverseArr(input1,input2,myArr);
		}
		
		for(int i=1;i<myArr.size();i++){
			System.out.print(myArr.get(i)+ " ");
		}

	}

	static void reverseArr(int input1, int input2, List<Integer> myArr){
		
		int temp = 0;

		for(int i=input1; i<=input2;i++){
			temp = myArr.get(i);
			myArr.set(i, myArr.get(input2));
			myArr.set(input2, temp);
			
			input2--;
		

		}
	}
}

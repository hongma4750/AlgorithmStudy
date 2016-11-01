package hancom;

import java.util.ArrayList;
import java.util.Scanner;


public class main_3 {
	public static void main(String args[]){
		
	
	//int x = 3646397;

	Scanner scan = new Scanner(System.in);
	int allCount = scan.nextInt();

	for(int j=0;j<allCount;j++){

		int sum = 0;
		int n = 0;
		
		scan = new Scanner(System.in);
		int x = scan.nextInt();
		x = Math.abs(x);
		
		for(int i=0;i<=1000000000;i++){
			sum += i;
			
			if(sum > x && (sum-x)%2 ==0){
				n = i;
				break;
			}
		}System.out.println(n);
		
		
	}

	//System.out.println("sum = "+sum+" n = "+n);
	
	}
}





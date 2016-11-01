package miridi;

import java.util.ArrayList;
import java.util.Scanner;

public class NineAndZero {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		int[] testArray = new int[T];
		long[] resultArray = new long[T];
		
		
		
		for(int i=0;i<testArray.length;i++){
			testArray[i] = scan.nextInt();
			resultArray[i] = checkNum(testArray[i]);
		}
		
		for(int j=0;j<resultArray.length;j++){
			System.out.println(resultArray[j]);
		}

	}
	
	static long checkNum(int N){
		
		int i=1;
		long findNum = 0;
		
		while(true){
			String comX = Integer.toBinaryString(i)+"";			//1~N 까지의 숫자를 각각 2진수 표기법으로 고친후 
			findNum = (long)Integer.parseInt(comX)*9;					//값에 9를 곱하여 0,9만 들어간 숫자 판단
			
			if(findNum>N &&  findNum%N==0 ){					//1,10,11,100,101...차례로 9를 곱하여 배수인지 판단 and 입력받은 숫자가 X보다는 커야함
				break;
			}	
			i++;
		}
		
		return findNum;
	}


}

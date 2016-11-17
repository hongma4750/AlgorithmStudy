package no_16;

import java.util.ArrayList;

public class main_hm_01 {

	public static void main(String[] args) {
		
		//피보나치 수열 만들기
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		int input = 50;
		
		int fir=0;
		int sec = 1;
		int temp = fir+sec;
		
		myList.add(fir);
		myList.add(sec);
		myList.add(temp);
		
		while(temp+sec <= input){
			fir=sec;
			sec=temp;
			temp=fir+temp;
			myList.add(temp);
		}

		for(int i=0;i<myList.size();i++){
			System.out.print(myList.get(i)+" ");
		}
	}

}

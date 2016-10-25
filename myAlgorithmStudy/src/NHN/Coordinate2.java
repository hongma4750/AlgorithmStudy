package NHN;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;




public class Coordinate2 {


	public static void main(String[] args) {
		


		ArrayList<Integer> numberList = new ArrayList<Integer>();


		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String input = br.readLine();
			String[] numStrList = input.split(" ");
			for (String numStr : numStrList) {
				numberList.add(Integer.parseInt(numStr));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


		ArrayList<Integer> maxNum = new ArrayList<Integer>();
		ArrayList<Integer> minNum = new ArrayList<Integer>();
		
		for(int i=0;i<numberList.size()-1;i++){
			for(int j=i+1;j<numberList.size();j++){
				
				int firstNum = 0;
				int secondNum = 0;
				
				if(numberList.get(i) / 10 <=0){
					firstNum = numberList.get(i);
					
					
					if(numberList.get(j) / 10 <= 0){
						secondNum = numberList.get(j);
					}else{
						secondNum = numberList.get(j) / 10;
					}
					
					if(firstNum < secondNum){
						int temp = numberList.get(i);
						numberList.set(i, numberList.get(j));
						numberList.set(j, temp);
						
						
						
					}else if(firstNum == secondNum){
						if(firstNum < numberList.get(j) % 10){
							
							int temp = numberList.get(i);
							numberList.set(i, numberList.get(j));
							numberList.set(j, temp);
							
						}
					}
				}else{
					firstNum = numberList.get(i) / 10;
					
					
					if(numberList.get(j) / 10 <= 0){
						secondNum = numberList.get(j);
					}else{
						secondNum = numberList.get(j) / 10;
					}
					
					if(firstNum < secondNum){
						int temp = numberList.get(i);
						numberList.set(i, numberList.get(j));
						numberList.set(j, temp);
						
					}else if(firstNum == secondNum){
						if(numberList.get(i)%10 < numberList.get(j)%10){
							int temp = numberList.get(i);
							numberList.set(i, numberList.get(j));
							numberList.set(j, temp);
						}
					}
					
				}
			}
		}
		String max = "";
		String min = "";
		for(int i=0;i<numberList.size();i++){
			max+=numberList.get(i);
		}
		
		for(int i=1;i<=numberList.size();i++){
			min += numberList.get(numberList.size()-i);
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		System.out.println(Integer.parseInt(max)+Integer.parseInt(min));
		
	}


}
package NHN;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Coordinate {
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
		
		// 다음과 같은 방식으로 numberList와 number 변수를 사용할 수 있음
        /*
		for (Integer number : numberList) {
			System.out.println("number=" + number);
		}
        */       
		
		ArrayList<Integer> checkList = new ArrayList<Integer>();
		
		for(int i=0;i<numberList.size();i++){
			for(int j=1;j<numberList.size();j++){
			if(numberList.get(i) > numberList.get(j)){
				int calNum = numberList.get(i) - numberList.get(j);
				int addNum = numberList.get(i) + numberList.get(j);
				
				if(checkList.size() == 0){
					checkList.add(calNum);
					checkList.add(addNum);
					checkList.add(numberList.get(i));
					checkList.add(numberList.get(j));
				}else{
					if(checkList.get(0)>calNum){
						if(checkList.get(1)>addNum){
							checkList.set(0, calNum);
							checkList.set(1, addNum);
							checkList.set(2, numberList.get(i));
							checkList.set(3, numberList.get(j));
							
							
						}
					}
				}
			}else{
				int calNum = numberList.get(j) - numberList.get(i);
				int addNum = numberList.get(j) + numberList.get(i);
				
				if(checkList.size() == 0){
					checkList.add(calNum);
					checkList.add(addNum);
					checkList.add(numberList.get(i));
					checkList.add(numberList.get(j));
				}else{
					if(checkList.get(0)>calNum){
						if(checkList.get(1)>addNum){
							checkList.set(0, calNum);
							checkList.set(1, addNum);
							checkList.set(2, numberList.get(i));
							checkList.set(3, numberList.get(j));
						}
					}
				}
			}
		}
		}
		System.out.println(checkList.get(2)+" "+checkList.get(3));
		
	}
}

package miridi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		
		//시간 복잡도 -> 0
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		//System.out.println("n : "+n+" x : "+x);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();

		int numCount = 0;
		
		for(int i=0;i<n;i++){
			numberList.add(scan.nextInt());
		}

		Collections.sort(numberList);			//  numberList에 담긴 숫자들을 오름차순으로 정렬
		Collections.reverse(numberList);		//  이후 반대로 정렬

		
		for(int i=0;i<numberList.size();i++){
			for(int j=i+1;j<numberList.size();j++){
				
				if(numberList.get(i) - numberList.get(j) > k){
					break;
				}else if(numberList.get(i) - numberList.get(j) == k){		//설정한 큰 숫자와 그와 가장 근접한 숫자의 뺄셈이 k 인지 판단
																			//근접한 숫자와 뺄셈이 k보다 크면 이후 판단 필요 x
					numCount++;

				}
				
			}
		}
												//총 N-1 번 확인
		System.out.println(numCount);
	}

}

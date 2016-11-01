package miridi;

import java.util.Scanner;

public class CenterOfArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();		//테스트 케이스 수 입력
		int repeat = 0;
		
		int[] arrayInt; 				//각 테스트에 사용될 배열 선언
		String[] yesOrNo = new String[count];
		while(count != repeat){
			String checkAi = "NO";
			
			int sum = 0;										//배열 숫자들의 합
			int checkSum=0;										//Ai를 제외한 왼편에 있는 숫자들의 합
			
			int arrayLength = scan.nextInt();					//각 테스트별 배열 크기 설정
			
			arrayInt = new int[arrayLength];					//배열 초기화
			
			for(int i=0;i<arrayInt.length;i++){
				arrayInt[i] = scan.nextInt();					//배열 크기만 큼 숫자 입력
				//System.out.println("["+i+"] = "+arrayInt[i]);
				sum+=arrayInt[i];								//배열에 담긴 숫자들의 합을 구함
			}
	
			
			for(int i=0;i<arrayInt.length;i++){
				sum -= arrayInt[i];								//왼쪽부터 차례로 총합에서 뺌
																
				
				if(checkSum == sum){							//왼쪽의 합과 (총합에서 왼쪽합)을 뺀 숫자와 비교
					checkAi = "YES";							//조건성립 -> YES로 변경
					//System.out.println("checkSum = "+checkSum+" 횟수 i : "+i);
					break;
				}
				checkSum += arrayInt[i];						//조건 성립이 안되었으면 왼쪽들의 합을 구함
																//Ai를 제외한 왼쪽들의 합과 오른쪽들의 합을 비교하기 때문에
																//조건을 비교후 왼쪽들의 합에 더함
			}
			
			yesOrNo[repeat]=checkAi;

			repeat++;
		}
		
		for(int i=0;i<yesOrNo.length;i++){
			System.out.println(yesOrNo[i]);
		}

	}

}

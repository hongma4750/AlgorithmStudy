package miridi;

import java.util.Scanner;

public class BigString {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		String[] stringArray = new String[t];
		char[] subArray;
		
		
		for(int i=0;i<stringArray.length;i++){
			stringArray[i] = scan.next();
		}
		
		for(int i=0;i<stringArray.length;i++){
			subArray = new char[stringArray[i].length()];
			
			
			for(int j=0;j<stringArray[i].length();j++){
				subArray[j] = stringArray[i].charAt(j);
			}

			//제일 마지막 글자를 기준으로 마지막 글자보다 사전적 순서보다 작은 글자를 찾음
			//있다면 글자를 바꾸고 바꾼 글자의 위치+1 부터 마지막 글자까지 오름차순으로 정렬
			//없다면 마지막 두번째부터 다시 작업시작
			one : for(int j=subArray.length-1;j>=0;j--){					
																									
				for(int x =j-1;x>=0;x--){
					if( j-1 >= 0 && subArray[j]>subArray[x] ){
						char temp = subArray[x];
						subArray[x] = subArray[j];
						subArray[j] = temp;

						//삽입정렬
						for(int fir=x+1; fir<subArray.length; fir++){
							char firstTemp = subArray[fir];
							int sec = fir-1;
							
							while(sec >=x+1 && subArray[sec] > firstTemp){
								subArray[sec+1] = subArray[sec];
								sec = sec-1;
							}
							
							subArray[sec+1] = firstTemp;
						}
						break one;
					}
				}				
			}
			
			String checkNo = "";
			for(int j=0;j<stringArray[i].length();j++){
				checkNo += subArray[j]+"";
			}
			
			if(stringArray[i].equals(checkNo)){
				stringArray[i] = "no answer";
			}else{
				stringArray[i] = checkNo;
			}
		}
		
		for(int i=0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}
		
	}

}

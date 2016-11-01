package oc_27;

public class main_hm02 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 10;
		int maxCycle = 0;
		int myCount = 0;
		
		for(int i=num1;i<=num2;i++){
			int checkNum = i;
			
			while(checkNum != 1){
				if(checkNum%2==0){
					checkNum = checkNum/2;
					myCount++;
				}else{
					checkNum = (checkNum*3)+1;
					myCount++;
				}
			}
			myCount++;
			if(myCount>=maxCycle){
				maxCycle=myCount;
			}
			myCount=0;
		}


		System.out.println(num1+" "+num2+" "+(maxCycle));
	}
}

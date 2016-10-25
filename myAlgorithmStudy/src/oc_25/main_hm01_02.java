package oc_25;


public class main_hm01_02 {
	
	static int[] checkSelfNum = new int[5000];
	
	public static void main(String args[]){


		long start =  System.currentTimeMillis();
		
		int allSum = 0;
		int mySum =0;
		
		for(int i=1;i<5000;i++){
			allSum += i;
			checkSelfNum[countSelfNum(i)]=1;
		}
		
		for(int i=1;i<5000;i++){
			if(checkSelfNum[i] == 1){
				mySum += i;
			}
		}
		
		System.out.println(allSum-mySum);
		
		long end =  System.currentTimeMillis();


		System.out.println( "실행 시간 : " + ( end - start )/1000.0f );
		
	}
	
	static int countSelfNum(int x){
		int sum =0;
		sum += x;
		
		for(int i=x;i>0; i /= 10){
			
			if(sum+i%10 <5000){
				sum+=i%10;
			}else{
				return 0;
			}
		}
		return sum;
	}
}


//사용시간 : 0.001초  무게:1kb

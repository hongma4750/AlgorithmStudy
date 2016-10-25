package oc_25;


public class main_hm02 {


	static int myCount =0;
	
	public static void main(String[] args) {
		long start =  System.currentTimeMillis();
		
		for(int i=1;i<10000;i++){
			count(i);
		}
		
		System.out.println(myCount);
		
		long end =  System.currentTimeMillis();


		System.out.println( "실행 시간 : " + ( end - start )/1000.0f );
	}
	
	static void count(int x){
		for(int i=x;i>0;i/=10){
			if(i%10 == 8){
				myCount++;
			}
		}
	}


}


//걸린시간 : 0.001초  무게 : 1kb

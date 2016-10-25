package oc_25;


public class main_hm01_01 {


	public static void main(String[] args) {
		
		int sum = 0;
		int allSum = 0;
		
		long start = System.currentTimeMillis();
		
		for(int i=1;i<5000;i++){
			int checkNum = i/10;
			allSum += i;
			
			if(checkNum <=0){			//i -> 1의자리  j -> 1의자리
				for(int j=1;j<i;j++){
					if(j+j == i){
						sum += i;
						break;
					}
				}
			}else if(checkNum <10){
				for(int j=1;j<i;j++){


					if(j/10 <=0){		//i -> 10의자리  j -> 1의자리 
						if(j+j == i){
							sum += i;
							break;
						}
					}else{				//i -> 10의자리  j -> 10의자리
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+j == i){
							sum += i;
							break;
						}
					}	
				}
				
			}else if(checkNum <100){
				for(int j=1;j<i;j++){


					if(j/10 <=0){		//i -> 100의자리  j -> 1의자리 
						if(j+j == i){
							sum += i;
							break;
						}
					}else if(j/10 <10){				//i -> 100의자리  j -> 10의자리
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+j == i){
							sum += i;
							break;
						}
					}else{					//i -> 100의자리  j -> 100의자리
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+Integer.parseInt(jener.substring(2,3))+j == i){
							sum += i;
							break;
						}
					}
				}
			}else if(checkNum<1000){
				for(int j=1;j<i;j++){


					if(j/10 <=0){		//i -> 100의자리  j -> 1의자리 
						if(j+j == i){
							sum += i;
							break;
						}
					}else if(j/10 <10){				//i -> 100의자리  j -> 10의자리
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+j == i){
							sum += i;
							break;
						}
					}else if(j/10 < 100){					//i -> 100의자리  j -> 100의자리
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+Integer.parseInt(jener.substring(2,3))+j == i){
							sum += i;
							break;
						}
					}else{
						String jener = j+"";
						
						if(Integer.parseInt(jener.substring(0,1))+Integer.parseInt(jener.substring(1,2))+
								Integer.parseInt(jener.substring(2,3))+Integer.parseInt(jener.substring(3,4))+j == i){
							sum += i;
							break;
						}
					}
				}
			}
			
			
		}
		System.out.println(allSum-sum);
		
		long end = System.currentTimeMillis();


		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
		
	}


}

//총 소요시간 : 1.07 무게:3kb
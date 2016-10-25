package hancom;

import java.util.ArrayList;


public class main_3 {
	public static void main(String args[]){
		
		int x = 3646397;
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		ArrayList<Integer> rangeList = new ArrayList<Integer>();
		
		myList.add(0);
		myList.add(1);
		myList.add(-1);
		
		
		int temp = 2;
		int numFind =0;
		
		rangeList.add(1);
		rangeList.add(2);
		
		
		for(int i=0;i<myList.size();i++){
			if(myList.get(i) == x){
				System.out.println(i);
				System.exit(-1);
			}
			numFind++;
		}
		
		
		
		
		loop1 : for(int i =2;i<=1000000000;i++){
			System.out.println(" i : "+i);
			int sumX = 0;
			int count = 2;
			int find = 0;
			
			temp = (int) Math.pow(2, i);
			
			
				for(int y = rangeList.get(0);y<=rangeList.get(1);y++){
					for(int j=1;j<=2;j++){
						if(count != 0){
							if(j%2==1){
								if(myList.get(y)+i != x){
									myList.add(myList.get(y)+i);
									count -- ;
									find ++;
								}else{
									System.out.println(i);
									break loop1;
								}
							}else{
								if(myList.get(y)+(i*-1) != x){
									myList.add(myList.get(y)+(i*-1));
									count -- ;
									find ++;
									
									count = 2;
									break;
									
								}
							}
					}
				}
			}
				
				int myTemp = rangeList.get(1);
				rangeList.set(0, myTemp+1);
				rangeList.set(1, myTemp+(int)Math.pow(2, i));
				
				
			
			
		}
	
	
	
	}
}


//hm 방식 실패


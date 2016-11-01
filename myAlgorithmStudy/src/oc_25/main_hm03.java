package oc_25;

public class main_hm03 {
public static void main(String[] args) {
		
		int x = 0, y = 0;
		
		int myPoint = 0;
		int myCount = 6;
		int checkPoint=1;
		
		int[][] spiral = new int[6][6];
		int right=1;
		int left =0,up = 0,down = 0;
		
		
		for(int i=0;i<11;i++){
			
			if(right>0){
				
				if(checkPoint ==2){
					myCount--;
					checkPoint=0;
				}
				
				for(int j=0;j<myCount;j++){
					spiral[x][y] = myPoint;
					
					if(j!=myCount-1){
						y++;
					}else{
						x++;
					}
					
					myPoint++;	
				}
				
				right=0;
				down=1;
				checkPoint++;
				
				
			}else if(down>0){
				
				if(checkPoint ==2){
					myCount--;
					checkPoint=0;
				}
				for(int j=0;j<myCount;j++){
					spiral[x][y] = myPoint;
					
					if(j!=myCount-1){
						x++;
					}else{
						y--;
					}
					
					myPoint++;	
				}
				
				down=0;
				left=1;
				checkPoint++;
				
				
			}else if(left>0){
				if(checkPoint ==2){
					myCount--;
					checkPoint=0;
				}
				
				for(int j=0;j<myCount;j++){
					spiral[x][y] = myPoint;
					
					if(j!=myCount-1){
						y--;
					}else{
						x--;
					}
					myPoint++;	
				}
				
				left=0;
				up=1;
				checkPoint++;
				
				
			}else if(up>0){
				if(checkPoint ==2){
					myCount--;
					checkPoint=0;
				}
				
				for(int j=0;j<myCount;j++){
					spiral[x][y] = myPoint;
					
					if(j!=myCount-1) {
						x--;
					}else{
						y++;
					}
					myPoint++;	
				}
				up=0;
				right=1;
				checkPoint++;
				
				
			}
		}
		
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				System.out.print(spiral[i][j]+"	");
			}System.out.println();
		}
	}

}

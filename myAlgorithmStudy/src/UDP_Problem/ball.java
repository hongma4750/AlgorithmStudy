package UDP_Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ball {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ballNum = sc.nextInt();
		
		List<MyBall> myArr = new ArrayList<MyBall>();
		
		MyBall myBall;
		
		for(int i=0;i<ballNum;i++){
			myBall = new MyBall();
			
			myBall.ballColor = sc.nextInt();
			myBall.ballSize = sc.nextInt();
			myBall.point = 0;
			
			myArr.add(myBall);
			
		}
		countPoint(myArr);
		
		for(int i=0;i<myArr.size();i++){
			System.out.println(myArr.get(i).point);
		}
		

	}
	
	
	
	static void countPoint(List<MyBall> myArr){
		int x = 0;
		
		while(true){

			for(int i=0;i<myArr.size();i++){
				if(x!=i){
					if(myArr.get(x).ballColor != myArr.get(i).ballColor &&
							myArr.get(x).ballSize > myArr.get(i).ballSize){
						myArr.get(x).point += myArr.get(i).ballSize;
					}
				}
			}
			
			if(x==(myArr.size()-1)){
				break;
			}
			x++;
			
		}
		
	}

}

class MyBall{
	int ballColor;
	int ballSize;
	int point;
}

package AlgorithmProblem;

import java.util.Scanner;

public class BOGGLE {
	
	static char[][] myArr = new char[5][5];
	
	
	public static void main(String args[]){
		
		// A: 65  Z : 90
		// ~ : 25
		
		
		//못하겟다
		
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				myArr[i][j] = (char)((int)(Math.random()*25)+65);
			}
		}
		
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(myArr[i][j]+" ");
			}System.out.println();
		}
		
		
		/*System.out.println();
		System.out.println("myArr[0][1] = "+myArr[1][0]);*/
		
		Scanner sc = new Scanner(System.in);
		
		String myWorld = sc.next();
		char[] words = null;
		
		for(int i=0;i<myWorld.length();i++){
			words[i]= myWorld.charAt(i);
		}
		
		hasWord(0,0,words);
	}
	
	static boolean hasWord(int y, int x, char[] words){
		
		
		/*if(!(myArr[y][x]+"").equals(word.substring(0,1))){ 
			System.out.println("원하는 단어 아님");
			return false;
		}*/
		int dx[] = {-1,-1,-1,1,1,1,0,0};
		int dy[] = {-1,0,1,-1,0,1,-1,1};
		
		
		if(inRange(y,x)) return false;
		if(myArr[y][x] != words[0]) return false;
		if(words.length == 1) return true;
		
		for(int i=0;i<8;i++){
			int nextY = y+dy[i], nextX = x+dx[i];
			
			if(hasWord(nextY,nextX,words)){
				return true;
			}
		}
		
		return false;
	}

	private static boolean inRange(int y, int x) {
		if(y>5 || y<0) return false;
		if(x>5 || x<0) return false;
		
		return true;
	}
}

package NHN;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RevPlus {
    public static void main(String[] args) {
        int number = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            number = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int count = 0;
        
        for(int i=0;i<3;i++){
        	int newNum = checkNum(number);
        	
        	if(newNum == number){
        		System.out.println(newNum);break;
        	}else{
        		count++;
        		number = newNum;
        	}
        }


        if(count==3)System.out.println("-1");




    }
    
    public static int checkNum(int check){
    	int checkLength = (int) check/10;
    	
    	if(checkLength<10){
    		String changeNum = check+"";
    		String temp1 = changeNum.substring(0,1);
    		String temp2 = changeNum.substring(1,2);
    		
    		if(temp1.equals(temp2)){
    			return check;
    		}else{
    			int chNum = Integer.parseInt(temp2+temp1);
    			return chNum+check;
    		}
    	}else if(checkLength<100){
    		String changeNum = check+"";
    		String temp1 = changeNum.substring(0,1);
    		String temp2 = changeNum.substring(1,2);
    		String temp3 = changeNum.substring(2,3);
    		
    		if(temp1.equals(temp3)){
    			return check;
    		}else{
    			int chNum = Integer.parseInt(temp3+temp2+temp1);
    			return chNum+check;
    		}
    	}else{
    		String changeNum = check+"";
    		String temp1 = changeNum.substring(0,1);
    		String temp2 = changeNum.substring(1,2);
    		String temp3 = changeNum.substring(2,3);
    		String temp4 = changeNum.substring(3,4);
    		
    		if(temp1.equals(temp4) && temp2.equals(temp3)){
    			return check;
    		}else{
    			int chNum = Integer.parseInt(temp4+temp3+temp2+temp1);
    			return chNum+check;
    		}
    	}
    }
}

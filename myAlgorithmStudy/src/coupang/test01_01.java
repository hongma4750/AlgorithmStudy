package coupang;

public class test01_01 {
public static void main(String args[]){
		
		String [] inputs = {"a","b","c","d","e","f","g","h"};
		
		String[] arr1 = null, arr2 = null, arr3 = null;
		
		if(inputs.length%3 == 0){
			arr1 = new String[inputs.length/3];
			arr2 = new String[inputs.length/3];
			arr3 = new String[inputs.length/3];
		}else if(inputs.length%3 == 1){
			arr1 = new String[(inputs.length/3)+1];
			arr2 = new String[inputs.length/3];
			arr3 = new String[inputs.length/3];
		}else if(inputs.length%3 == 2){
			arr1 = new String[(inputs.length/3)+1];
			arr2 = new String[(inputs.length/3)+1];
			arr3 = new String[inputs.length/3];
		}
		
		
		int whereareyou =0;
		int count = 0;
		
		for(int i=0;i<inputs.length;i++){
			if(whereareyou == 0 ){
				arr1[count]=inputs[i];
				whereareyou++;
			}else if(whereareyou == 1){
				arr2[count]=inputs[i];
				whereareyou++;
			}else if(whereareyou ==2){
				arr3[count]=inputs[i];
				whereareyou=0;
				count++;
			}
		}
		
		whereareyou =0;
		count = 0;
		for(int i=0;i<inputs.length;i++){
			if(whereareyou == 0 ){
				
				System.out.print("[arr1,"+arr1[count]+"]");
				whereareyou++;
			}else if(whereareyou == 1){
				
				System.out.print("[arr2,"+arr2[count]+"]");
				whereareyou++;
			}else if(whereareyou ==2){
				
				System.out.print("[arr3,"+arr3[count]+"]");
				whereareyou=0;
				count++;
			}
		}
		
		
		
		
		
	}
}


package no_16;

public class main_hm_03 {
	public static void main(String args[]){
		//음수는 앞으로 양수는 뒤로
		//그러나 숫자들의 순서는 그대로
		
		int[] inputs = {-1,1,3,-2,2};
		
		int myIndex = 0;
		int temp = 0;
		
		for(int i=0;i<inputs.length;i++){
			if(inputs[i] <0){
				temp = inputs[myIndex];
				int sectemp = 0;
				inputs[myIndex] = inputs[i];
				
				for(int j=myIndex+1;j<=i;j++){
					sectemp = inputs[j];
					inputs[j] = temp;
					temp = sectemp;
				}
				
				myIndex++;
			}
		}
		
		for(int i=0;i<inputs.length;i++){
			System.out.print(inputs[i]+" ");
		}
		
		
	}
}

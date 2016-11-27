package no_27;

public class mySort {
	public static void main(String args[]){
		
		int inputs[] = {1,2,3,4,5,6,7};
		
		int cen = inputs.length/2;
		if(cen%2!=0){
			cen +=1;
		}
		int fir = 1;
		
		for(int i=cen;i<inputs.length;i++){
			int temp = inputs[fir];
			inputs[fir] = inputs[i];
			
			for(int j=fir+1;j<=i;j++){
				int myTemp = inputs[j];
				inputs[j] = temp;
				temp = myTemp;
			}
			fir+=2;
		}
		
		
		//출력
		for(int i=0;i<inputs.length;i++){
			System.out.print(inputs[i]);
		}
	}
	
}

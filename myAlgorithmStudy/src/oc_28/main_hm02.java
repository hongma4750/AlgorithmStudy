package oc_28;

public class main_hm02 {
	public static void main(String[] args) {
		int[] preSort = {5,2,4,6,1,3};
		
		for(int i=1;i<preSort.length;i++){
			int myPosition = i;
			int temp=0;
			int myTemp=0;
			
			for(int j=i-1; j>=0; j--){
				 
				if(preSort[j] < preSort[i]){
					myPosition = j+1;
					temp = preSort[j+1];
					break;
				}else if(j == 0 && preSort[j] > preSort[i]){
					myPosition=0;
					temp=preSort[0];		
				}
			}


			preSort[myPosition] = preSort[i];
			
			for(int j=myPosition+1; j<=i;j++){
				myTemp = preSort[j];
				preSort[j] = temp;
				temp = myTemp;
			}
		}


		for(int i=0;i<preSort.length;i++){
			System.out.print(preSort[i]);
		}
		
	}
}

package oc_27;

public class main_hm01 {
	public static void main(String[] args) {
		String inputText = "aaabbccccccaa";
		int myCount = 1;
		int length=0;
		
		
		one : for(int i=0;i<inputText.length();i++){
			for(int j=i+1; j<=inputText.length();j++){
				if(j==inputText.length()){
					System.out.print(inputText.substring(i,i+1)+myCount);
					break;
				}
				if(inputText.substring(i, i+1).equals(inputText.substring(j,j+1))){
					myCount++;
					
					if(j+1==inputText.length()){
						System.out.print(inputText.substring(i,i+1)+myCount);
						break one;
					}
				}else{
					System.out.print(inputText.substring(i,i+1)+myCount);
					length +=myCount;
					i=length-1;
					myCount=1;
					break;
				}
			}
		}


	}
}

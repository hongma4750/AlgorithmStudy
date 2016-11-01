package oc_27;

public class main_hm01_02 {

	public static void main(String[] args) {
		
		String inputText = "aaabbccccccaa";
		int myCount = 0;
		String resultText = "";
		
		String tempText = inputText.substring(0,1);
		myCount ++;
		
		for(int i=1;i<inputText.length();i++){
			if(tempText.equals(inputText.substring(i,i+1))){
				myCount++;
			}else{
				resultText += tempText+myCount+"";
				myCount =0;
				
				tempText= inputText.substring(i,i+1);
				myCount++;
			}
			
			if(i == inputText.length()-1){
				resultText += tempText+myCount+"";
			}
			
		}
		System.out.println(resultText);
		
	}

}

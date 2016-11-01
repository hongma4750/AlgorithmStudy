package oc_28;

public class main_hm01 {
	public static void main(String[] args) {
		String inputText = "a1b2cde3~g45hi6";


		String textText="";


		for(int i=0;i<inputText.length();i++){


			if(i%2 == 1 && isNumber(inputText.substring(i,i+1))){
				textText += "*";	
			}else{
				textText += inputText.substring(i,i+1);	
			}
		}
		System.out.println(textText);
		
	}
	
	static boolean isNumber(String text){
		try{
			Integer.parseInt(text);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}

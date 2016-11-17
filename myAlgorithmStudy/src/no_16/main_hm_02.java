package no_16;

public class main_hm_02 {
	public static void main(String args[]){
		String[] inputs = {"0123456789","01234","01234567890","6789012345","012322456789" };
		
		boolean result = false;
		
		for(int i=0;i<inputs.length;i++){
			
			int[] myArr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
			
			if(inputs[i].length() == 10){
				for(int j=0;j<inputs[i].length();j++){
					int number = Integer.parseInt(inputs[i].substring(j,j+1));
					
					if(myArr[number] == -1){
						myArr[number] = number;
						result=true;
					}else{
						System.out.println("false");
						result = false;
						break;
					}
				}
			}else{
				System.out.println("false");
			}
			
			if(result){
				System.out.println("true");
				result=false;
			}
		}
	}
	
}

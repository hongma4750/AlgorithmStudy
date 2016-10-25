package NHN;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class CharacterSequence {
    public static void main(String[] args) {
        String[] words = null;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            words = line.split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // 다음과 같은 방식으로 words와 word 변수를 사용할 수 있음
        /*
        for (String word : words) {
            System.out.println(word);
        }
        */
        
        
        int aCount = 0;
        int bCount = 0;
        
        for(int i =0;i<words.length;i++){
        	String checkWord = words[i];
        	
        	for(int j=0;j<checkWord.length();j++){
        		
        		char myWord = checkWord.charAt(j);
        		
        		if(myWord == 'a' || myWord == 'e' || myWord == 'i' || myWord == 'o' || myWord == 'u'){
        			if((j+1) <= checkWord.length()-1){
        				
	        			if(checkWord.charAt(j+1) == 'a' ||checkWord.charAt(j+1) == 'e' ||checkWord.charAt(j+1) == 'i' 
	        					||checkWord.charAt(j+1) == 'o' ||checkWord.charAt(j+1) == 'u'){
	        				aCount++;
	        				break;
	        			}
        			}
        		}else{
        			
        			if((j+2) <= checkWord.length()-1){
        				if(!(checkWord.charAt(j+1) == 'a' || checkWord.charAt(j+1) == 'e' || checkWord.charAt(j+1) == 'i' 
	        					|| checkWord.charAt(j+1) == 'o' || checkWord.charAt(j+1) == 'u')){
        						if(!(checkWord.charAt(j+2) == 'a' || checkWord.charAt(j+2) == 'e' || checkWord.charAt(j+2) == 'i' 
        	        					|| checkWord.charAt(j+2) == 'o' || checkWord.charAt(j+2) == 'u')){
        	        				bCount++;
        	        				break;
        	        			}
	        			}
        			}
        		}
        	}
        }
        
        System.out.println(aCount + " " +bCount);
    }
}

package hancom;

public class main_2 {

	public static void main(String[] args) {
		String acgtSequence = "ACCGGCCGAGACAGCGAGCATATGCCGCCGAGACAGGCCGGACCGGCCGAGA";
		String codon = "GCC";
		
		for(int i=0;i<acgtSequence.length();i++){
			int codonLength = codon.length();
			int codonCount=0;
			
			for(int j =0;j<codonLength;j++){
				if(i+j< acgtSequence.length()){
					if(acgtSequence.charAt(i+j) == codon.charAt(j)){
						codonCount++;	
					}else{
						break;
					}
					if(codonCount == codonLength){
						System.out.println(i);
						i += codonLength;
					}
				}
				
			}
		}
}

	}



package miridi;

public class test02 {
	public static void main(String args[]){
		String[] x = new String[20];
		
		for(int i=0;i<20;i++){
			x[i] = Integer.toBinaryString(i)+"";
			System.out.println(Integer.parseInt(x[i])*9);
		}
	}
}

package myCollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class mySetTest {

	public static void main(String[] args) {

		Object[] objarr = {"3","1", new Integer(1),"2","2","3","4","4","4"};
		
		//Set set = new HashSet();
		Set set = new LinkedHashSet();
		
		for(int i=0;i<objarr.length;i++){
			set.add(objarr[i]);
		}
		
		System.out.println(set);

	}

}

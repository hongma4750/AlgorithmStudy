package myCollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class myTreeSetTest {

	public static void main(String[] args) {
		Set myTreeSet = new TreeSet();
		
		for(int i=0; myTreeSet.size() < 6 ; i++){
			int num = (int)(Math.random()*45)+1;
			myTreeSet.add(num);
			System.out.println("setProperty : "+num);
		}
		
		System.out.println("------------------------");
		System.out.println(myTreeSet);

	}

}

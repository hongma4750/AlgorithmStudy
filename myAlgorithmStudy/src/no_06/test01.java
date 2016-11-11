package no_06;

import java.util.List;

public class test01 {

	public static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("안 a = "+x+" b = "+y);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("swap() 메소드 호출 <전>: a=" + a + ", b=" + b);
		swap(a, b);
		System.out.println("swap() 메소드 호출 <후>: a=" + a + ", b=" + b);
	}

}

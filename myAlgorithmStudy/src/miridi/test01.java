package miridi;

import java.util.ArrayList;

public class test01 {

	public static void main(String[] args) {
		
		int[] stack = new int[100];
        int top=0;        
        int j;
        int N=100; // change the value of N to get different results.
        for(j=1;j<=N;j++ )
        {
            int i=j;
            while(i != 0)
            {
                stack[top++] = i % 2; // push the ones digit of binary of i in stack
                i= i>> 1;                    // right bit shift
            }
            pop_print(stack, top-1);  // pop each value from stack and print
            top=0;
        }
    }
     
    private static void pop_print(int stack[], int top)
    {
        int i=0;        
        for(i=top; i>=0;i--)
        {
            System.out.print(stack[i]*9);
        }
        System.out.print(" ");
    }

}

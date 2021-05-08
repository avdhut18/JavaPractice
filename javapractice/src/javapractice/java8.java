/////// Sorting of Array //////
package javapractice;

import java.util.Arrays;

public class java8 {
	
	public static void main(String[] args) {
		
		int[] ar = {40,20,60,100};
		Arrays.sort(ar);
		System.out.println("Ascending Order");
		for(int i=0;i <ar.length;i++)
			
			
		System.out.print (ar[i]+ " ");
		System.out.println();
		
		System.out.println("Decending Order");
		
		for(int i = ar.length-1; i>=0; i--)
			System.out.print(ar[i] + " ");
		
		
		
	}

}

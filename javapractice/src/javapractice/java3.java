//////////////Arrays are equals or not////////////////
package javapractice;

import java.util.Arrays;

public class java3 {
	public static void main(String[] args) {
		
	
	int[] a = {1,2,3,4,5,6};
	int[] b = {1,2,3,4,5,6};
	int[] c = {1,2,4,5,6};

	System.out.println(Arrays.equals(a, b));
	System.out.println(Arrays.equals(a, c));
    System.out.println(Arrays.equals(b, c));
	
	}

}

///// sorting array without arrays.sort /////////
package javapractice;

public class java9 {
	
	public static void main(String[] args) {

		int[] ar = {20,50,10,90,40};
		int temp =0;
		
		//display orignal array 
		for(int i = 0; i<ar.length; i++)
		System.out.print(ar[i] + " ");
		System.out.println();
		
		///sorting 
		for(int i = 0; i<ar.length; i++)
		for(int j=i+1; j<ar.length;j++ )
		{
			if(ar[i]>ar[j])
			{
			 temp = ar[i];
			 ar[i]=ar[j];
			 ar[j]=temp;
			}
		}
		
	
 for(int i =0 ; i<ar.length;i++)
	 System.out.print(ar[i] + " ");
	}

}

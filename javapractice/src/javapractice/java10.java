/////Reverse String Program ///// 

package javapractice;

public class java10 {

	public static void main(String[] args) {
		
		String s="welcome";
		String  rev = "";
				
		 for(int i = s.length()-1;i>=0;i--)
			 
			 rev=rev + s.charAt(i);
		System.out.print(rev);
		System.out.println();
		
		if(s.equals(rev))
		{
			System.out.println("String is pallingdrom");
		}
		else
			System.out.println("String is Not pallingdrom");
	}
	
	
}

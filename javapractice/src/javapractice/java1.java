//////////////////Duplicate String Program/////////////////////////

package javapractice;

import java.util.HashMap;
import java.util.Set;

class java1{

	
	public static void main(String[] args) {
		
		//string initialization 
		 String str ="aaddffjghldlswyuriegsfaddadfjfkfhdkhdgfwhe";
		
		//converting string to array
		 char[] ar = str.toCharArray();
		 
		 //import hashmap class
		 HashMap<Character,Integer> smap = new HashMap<Character,Integer>();
		 
		 //creating "for" loop for char array
		 for(char str1:ar)
		 {
			 if(smap.containsKey(str1))    ///checking number of times str1 set char's are present in hashmap
			 {
				 smap.put(str1, smap.get(str1)+1);   ///present more than 1 time
			 }
			 else {
				 smap.put(str1, 1);   // present only 1 time
			 }
		 }
		// need to pick only those set of char which are present more than one time
		  Set<Character> keys = smap.keySet();
		  for(char key:keys)
		  {
			  if(smap.get(key)>1)
			  {
				  System.out.println(key + ":" + smap.get(key));
			  }
		  }
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
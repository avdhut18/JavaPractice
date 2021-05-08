//////////////////Duplicate String In Array/////////////////////
package javapractice;

import java.util.HashMap;
import java.util.Set;

public class java2 {

	public static void main(String[] args) {
		
	//array initialization
	String[] ar = {"avdhut","avdhut","ramesh","avdhut","jasmine","suresh","aadesh","sam","papa","jasmine","jasmine","jasmine","mom"};
	//importing Hashmap
	HashMap<String,Integer> smap = new HashMap<String,Integer>();
	
	//creating "for" loop of arrays
	
	for(String ar1:ar)
	{
		if(smap.containsKey(ar1))
		{
			smap.put(ar1,smap.get(ar1)+1);
		}
		else {
			smap.put(ar1,1);
		}
	}
	
	Set<String> keys = smap.keySet();
	for(String key:keys)
	{
		if(smap.get(key)>1)     
		{
			System.out.println(key+":"+smap.get(key));
		}
	}
	}}

//////////////////2nd largest number in array/////////////////////
package javapractice;

import java.util.ArrayList;
import java.util.TreeSet;

public class java5 {
	
	public static void main(String[] args) {
//array initialization
		int[] ar= {50,40,30,20,10,5,0};
		
		TreeSet tr = new TreeSet();
	for(int set:ar)
	{
		tr.add(set);
	}
	ArrayList list= new ArrayList(tr);
	System.out.println("2nd largest number :"+list.get(list.size()-2));
	System.out.println("largest number :"+list.get(list.size()-1));
	System.out.println();
	System.out.println("2nd lowest number :" + list.get(1));
	System.out.println("lowest number :" + list.get(0));
	}}

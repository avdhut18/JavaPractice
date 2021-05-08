////ArmStrong number///
package javapractice;

public class java7 {
	
public static void main(String[] args) {
	
int n= 153;	
int reminder =0;
int result =0;
	int tem = n;

	 tem = n;
	while(tem != 0)
	{
		reminder = tem%10;/// 3--5--1
		 result = result+(reminder*reminder*reminder);
		 tem = tem/10;  /// 15----1--0
	}
	if(result==n)
	{
		System.out.println(n + " is armstrong number");
	}
	else
		System.out.println(n + " is not an armstrong number");
	
}
}
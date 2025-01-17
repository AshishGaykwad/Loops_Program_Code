package whileLoop;

import java.util.*;

public class harshadnumber {

	public static void main(String[] args) {


		int num=171;
		int temp=num;
		int sum=0;
		
		while(sum>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(temp%num==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}
		
		}
	

}

package NumberPattern;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int end=1;
//		int cnt1=1;
//		for(int i=1;i<=5;i++)
//		{
//			int diff = 4;
//			int cnt2 = cnt1;
//			
//			for (int j = 1; j<=end; j++) 
//			{
//				
//				System.out.print(cnt2 +" ");
//				cnt2=diff+cnt2;
//				diff--;
//			}
//			System.out.println();
//			end++;
//			cnt1++;
		
//		int a[]= {90,8,7,2,6,1};
//		
//		for(int i=0;i<a.length;i++)
//			
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp =a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(a));
		
		int []a= {1,1,2,3,3,4,4,5,6,7,8,8};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;	
			}
			if(cnt==0)
				System.out.print(a[i]+" ");
		}
		
	}

}

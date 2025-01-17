package whileLoop;

import java.util.ArrayList;

public class table5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		while (i<=10)
//		{
//			System.out.println(5*i);
//			i++;
//		}
		
//		String s1="ABCD";
//		String s2="";
//		
//		for (int i = 0; i < s1.length(); i++)
//		{
//			char ch=s1.charAt(i);
//			
//			if(ch>='A' && ch<='Z')
//			{
//				ch=(char) (ch+32);
//			}
//			s2=s2+ch;
//		}
//		System.out.println(s2);
	
		int a[]= {1,2,3,4,5,6};
		
		ArrayList <Integer> list = new ArrayList();
		
		for(Integer i:a)
		{
			list.add(i);
		}
		
		int temp=list.get(0);
		list.remove(0);
		list.add(temp);
		System.out.println(list);
	
		
		
	}

}

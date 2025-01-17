package pattern;

import java.util.Iterator;
import java.util.Scanner;

//import java.util.Iterator;

//final class a
//{
//	int i;
//}
//class b extends a 
//{
//	
//}
//class box
//{
//	int weight;
//	int height;
//	int lenght;
//}

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		box obj= new box();
//		System.out.println(obj);

//		int icnt=5;
//		int jcnt=5;
//		int spacecnt=0;
//		for(int i=1;i<=icnt;i++)
//		{
//			for(int j=1;j<=jcnt;j++)
//			{
//				if(j<=spacecnt)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			spacecnt++;
//		}
//		int spacecnt=4;
//		int irange=9;
//		int jrange=5;
//		for (int i = 1; i <= irange; i++)
//		{
//		  for (int j = 1; j <= jrange; j++) 
//		  {
//			if(j<=spacecnt)
//				System.out.print(" ");
//			else
//				System.out.print("*");
//		}	
//		System.out.println();
//			if(i<jrange)
//				spacecnt--;
//			else
//				spacecnt++;
//		}
//		int x=2;
//		int y=0;
//		for(y=0;y<10;++y)
//		{
//			
//		if(y%x==0)
//			continue;
//		else if(y==8)
//			break;
//		else
//			System.out.print(y+" ");
//		
//		}

//		int a=0;
//		int b=1;
//		System.out.println(a);
//		System.out.println(b);
//		for(int i=1;i<=10;i++)
//		{
//			
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
//		

//		int irange=9;
//		int jrange=5;
//		int spaceCnt=4;
//		
//		for(int i=1;i<=irange;i++)
//		{
//			for(int j=1;j<=jrange;j++)
//			{
//				if(j<=spaceCnt)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			
//			if(i<=5)
//			{
//				spaceCnt--;
//			    jrange++;
//			}
//			else
//			{
//				spaceCnt++;
//				jrange--;
//			}
//			
//		}

//		int irange=9;
//		int jrange=9;
//		
//		int spaceCnt=4;
//		
//		for (int i = 1; i <= irange; i++) 
//		{
//			for (int j = 1; j <= jrange; j++) 
//			{
//				if(j<=spaceCnt)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			
//			
//			if(i<5)
//			{
//			spaceCnt--;
//			jrange--;
//			}
//			else
//			{
//				spaceCnt++;
//				jrange++;
//			}
//		}

//		pattern
//		       1
//		      12
//		     123
//		    1234
//		   12345
//		  123456
//		 1234567
//		12345678
//       123456789	

//		int spaceCnt=8;
//		
//		for (int i=1;i<=9;i++)
//		{ 
//			int cnt1=1;
//			for(int j=1;j<=9;j++)
//			{
//				if(j<=spaceCnt)
//				System.out.print(" ");
//				else
//					System.out.print(cnt1++);	
//			}
//			System.out.println();
//			spaceCnt--;
//			
//		}

//		12345
//		2345
//		345
//		45
//		5
//		45
//		345
//		2345
//		12345

//		int end = 5;
//		
//		for(int i=1;i<=9;i++)
//		{
//			int cnt1=1;
//			for(int j=1;j<=end;j++)
//			{
//				
//					System.out.print(j);
//				
//			}
//			System.out.println();
//			if(i<5)
//				end--;
//			else
//				end++;
//		}

//		1
//		12
//		123
//		1234
//		12345
//		1234
//		123
//		12
//		1

//		  *  
//		  *
//		*****
//		  *
//		  *
//		

//		12345
//		2345
//		345
//		45
//		5
//		

//		00*00
//		00*00
//		*****
//		00*00
//		00*00

//		
//		1
//		10
//		101
//		1010
//		10101
//		
//		int end=1;
//		
//		for (int i = 1; i <=5; i++)
//		{
//			
//			
//			for (int j = 1; j <= end; j++) 
//				
//			{
//				if(j%2==0)
//				{
//					System.out.print(0);
//					
//				}
//				else
//					System.out.print(1);
//				
//			}
//			System.out.println();
//			end++;
//			
//		}
//		int end = 1;
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= end; j++) {
//				if (j == 1 || i > 9)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//
//				if (j == 2) {
//					System.out.print("*");
//				} else
//					System.out.print(" ");
//			}
//			System.out.println();

		}

		// int rows = 7; // You can adjust the number of rows as needed
//

//	        for (int i = 0; i <= 7; i++)
//	        {
//	            for (int j = 0; j <= 9; j++)
//	            { 
//	                for (int k = 0; k <3; k++)
//	                { 
//	                    System.out.print(j);
//	                }
//	            }
//	            System.out.println(); 
//	           
//	        }

//		1        1
//		12      21
//		123    321 
//		1234  4321
//		1234554321

//		int ftsp=1;
//		int stpe=10;
//		
//		for (int i = 1; i <= 5; i++)
//		{
//			int cnt1=1;
//			for (int j = 1; j <11; j++)
//			{
//				if(j<=ftsp || j>=stpe)
//					System.out.print(cnt1);
//				else
//					System.out.print(" ");
//				if(j<5)
//					cnt1++;
//				else
//					cnt1--;
//			}
//			System.out.println();
//			ftsp++;
//			stpe--;
//		}

//		        int decimal = 0121;
//		        
//		        if (decimal == 0) {
//		            System.out.println("Binary representation: 0");
//		        } else {
//		            StringBuilder binary = new StringBuilder();
//		            while (decimal > 0) {
//		                int remainder = decimal % 2;
//		                binary.insert(0, remainder); // Insert remainder at the beginning of the string
//		                decimal = decimal / 2;
//		            }
//		            System.out.println("Binary representation: " + binary.toString());
//		        }

//		        import java.util.Scanner;
//
//		        public class BinaryToDecimal {
//		            public static void main(String[] args) {
//		                Scanner scanner = new Scanner(System.in);
//		                System.out.print("Enter a binary number: ");
//		                String binaryString = scanner.nextLine();
//
//		                int decimal = 0;
//		                int power = 0;
//
//		                for (int i = binaryString.length() - 1; i >= 0; i--) {
//		                    int digit = Character.getNumericValue(binaryString.charAt(i));
//		                    decimal += digit * Math.pow(2, power);
//		                    power++;
//		                }
//
//		                System.out.println("Decimal representation: " + decimal);
//		            }
//		        }

//		String s1 = "abcde";
//
//		char[] ch = s1.toCharArray();
//		
//		char temp = ch[0];
//		ch[0]=ch[ch.length-1];
//		ch[ch.length-1]= temp;
//		
//		String result = new String (ch);
//		
//		System.out.println(result);

//		int a[] = {1,2,3,4,5,6,7,8,9};
//		
//		for (int i = 0; i < a.length; i++)
//		{
//			int cnt=0;
//			for (int j = 0; j < i; j++)
//			{
//				if(a[i]==a[j])
//					cnt++;
//			}
//			if(cnt==0)
//			{
//				System.out.println(a[i]);
//			}
//		}

//		int a[]= {1,2,3,4,5,6,7,8,9};
//		
//		int [][] b = new int[3][3];
//		
//		for (int i = 0; i < b.length; i++)
//		{
//			for (int j = 0; j < b.length; j++)
//			{
//				b[i][j]=a[i*3+j];
//			}
//		}
//		
//		for (int i = 0; i < b.length; i++) 
//		{
//			for (int j = 0; j < b.length; j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}

		int irange=5;
		int jrange=10;
		
		int ftsp=1;
		int step=10;
		
		for (int i = 1; i <= irange; i++)
		{
			int cnt1=1;
			for (int j = 1; j <= jrange; j++)
			{
				if(j<=ftsp || j>=step)
					System.out.print(cnt1);
				else
					System.out.print(" ");
				if(j<5)
					cnt1++;
				else
					cnt1--;
			}
			System.out.println();
				ftsp++;
				step--;
		}
		

//		int irange = 9;
//		int jrange = 9;
//
//		int ftsp = 1;
//		int step = 9;
//
//		for (int i = 1; i <= irange; i++)
//		{
//			for (int j = 1; j <= jrange; j++) 
//			{
//				if(j<=ftsp || j>=step)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				ftsp++;
//				step--;
//			}
//			else
//			{
//				ftsp--;
//				step++;
//			}
//		}

//		int []a= {1,5,2,52,5};
//		int[] a = { 1, 2, 3, 4, 5, 1 };
//
//		for (int i = 1; i < a.length; i++)
//		{
//			int cnt = 0;
//			for (int j = i + 1; j < a.length; j++)
//			{
//				if (a[i] == a[j])
//					cnt++;
//			}
//			if (cnt != 0) {
//				System.out.println(a[i]);
//
//				System.out.println("index is : " + i);
//			}
//		}

	}
}

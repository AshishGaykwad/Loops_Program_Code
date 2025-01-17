
package pattern;

//import whileLoop.sepratenumberaddition;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstTringlEendPoint=5;
		int secondTringlStartPoint=6;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=firstTringlEendPoint || j>=secondTringlStartPoint)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<5)
			{
				firstTringlEendPoint--;
				secondTringlStartPoint++;
				
			}
			else
			{
				firstTringlEendPoint++;
				secondTringlStartPoint--;
			}
		}
		
		
		
		
		
		
		
//		int firstTriangleEndPoint=5;
//		int SecondTriangleStartPoint=6;
//		
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				if(j<=firstTriangleEndPoint || j>=SecondTriangleStartPoint)
//				System.out.print("*");
//				else
//				System.out.print(" ");
//			}
//		
//		
//		System.out.println();
//		if(i<5)
//		{
//			firstTriangleEndPoint--;
//			SecondTriangleStartPoint++;
//		}
//		else
//		{
//			firstTriangleEndPoint++;
//			SecondTriangleStartPoint--;
//		}
//		}
			
	}

}


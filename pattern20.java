package pattern;

public class pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstTringleStartPoint=1;
		int secondTringlEndPoint=10;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=firstTringleStartPoint || j>=secondTringlEndPoint)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<5)
			{
				firstTringleStartPoint++;
				secondTringlEndPoint--;
				
			}
			else
			{
				firstTringleStartPoint--;
				secondTringlEndPoint++;
			}
		}
	}

}

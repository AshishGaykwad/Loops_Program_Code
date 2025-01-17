package hardPattern;

public class aLetter {

	public static void main(String[] args) {
		
		
		int irange=7;
		int jrange=5;
		
		for(int i=1;i<=irange;i++)
		{
			for(int j=1;j<=jrange;j++)
			{
				if((i==1 && j>1 && j<5)  || (i==2 && j==1) || (i==2 && j==5) ||
					(i==3 && j==1) || (i==3 && j==5) || (i==4 && j>0 && j<6) ||
					(i==5 && j==1) || (i==5 && j==5) || (i==6 && j==1) || (i==6 && j==5)
					||(i==7 && j==1) || (i==7 && j==5))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

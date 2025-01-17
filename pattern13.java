package pattern;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end = 9;
		int spacecnt=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=spacecnt)
				
					System.out.print(" ");
				
				else
				
					System.out.print("* ");
				
			}
			System.out.println();
			end--;
			spacecnt++;
		}
	}

}

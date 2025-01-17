package pattern;

public class two {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=end;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end--;
		}
		
		int end2=2;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=end2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end2++;
		}
		
	}

}

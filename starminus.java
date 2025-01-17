package pattern;

public class starminus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for (int j=1; j<=end;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			end--;
		}
	}

}

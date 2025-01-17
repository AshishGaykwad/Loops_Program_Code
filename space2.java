package pattern;

public class space2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spacecnt = 0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if (j <= spacecnt)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			spacecnt++;
		}

	}

}

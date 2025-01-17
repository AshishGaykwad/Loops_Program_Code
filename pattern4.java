package NumberPattern;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=6;
		
		for(int i=1;i<=6;i++)
		{
			int cnt1=1;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt1);
				cnt1++;
			}
			System.out.println();
			end--;
		}
	}

}

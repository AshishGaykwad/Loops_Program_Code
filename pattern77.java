package NumberPattern;

public class pattern77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=1;
		int cnt1=1;
		for(int i=1;i<=5;i++)
		{
			int cnt2=cnt1;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt2+" ");
				
				cnt2--;
			}
			System.out.println();
			end++;
			cnt1++;
		}
		
	}

}

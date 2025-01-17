package pattern;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spaceCnt=4;
		int cnt1=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				//int cnt2=cnt1;
			if(j<=spaceCnt)
			{
				System.out.print(" ");
				
			}
			else
			{
				System.out.print(cnt1);
				//cnt2--;
			}
			}
			System.out.println();
			
			if(i<5)
			{
				spaceCnt--;
				cnt1++;
				
			}
			else
			{
				spaceCnt++;
				cnt1--;
			}
		}
		
			
		
	}

}

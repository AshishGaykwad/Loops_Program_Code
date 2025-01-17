package pattern;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spaceCnt=4;
		
		for(int i=1;i<=5;i++)
		{
			int cnt1=1;
			for(int j=1;j<=5;j++)
			{
				
				if(j<=spaceCnt)
					System.out.print(" ");
				else
					System.out.print(cnt1++);
			}
			System.out.println();
			spaceCnt--;
		}
		
	}

}

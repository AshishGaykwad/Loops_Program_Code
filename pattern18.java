package pattern;

public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int spaceCnt=0;
		int end=5;
		
		for (int i = 1; i <=9; i++) 
		{
			for (int j = 1; j <=end; j++)
			{
				if(j<=spaceCnt)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				spaceCnt++;
				end++;
				
			}
			else
			{
				spaceCnt--;
				end--;
				
			}
		}
	}

}


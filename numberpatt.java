package pattern;

public class numberpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=5;
		int cnt1=1;
		for (int i = 1; i <=5; i++) 
		{
			int cnt2=cnt1;
			for (int j = 1; j <= end; j++) 
			{
				System.out.print(cnt2++);
			}
			System.out.println();
			end--;
			cnt1++;
			
		}
		
		int end2 =1;
		int cnt3=5;
		for (int i = 1; i <=5; i++) 
		{
			int cnt4=cnt3;
			for (int j = 1; j <= end2; j++) 
			{
				System.out.print(cnt4++);
			}
			System.out.println();
			end2++;
			cnt3--;
		}
	}

}

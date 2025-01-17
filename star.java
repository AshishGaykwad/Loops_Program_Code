package pattern;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int spaceCnt=4;
		int cnt=1;
		for (int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=spaceCnt)
					System.out.print(" ");
					else
						System.out.print(cnt+" ");
			}
			System.out.println();
			if(i<5)
			{
			spaceCnt--;
			cnt++;
			}
			else
			{		
			spaceCnt++;
			cnt--;
			}
		}
	}

}

//    1
//   22
//  333
// 4444
//55555
// 4444
//  333
//   22
//    1
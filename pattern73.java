package characterpattern;

import java.util.Iterator;

public class pattern73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int end=1;
//		
//		for (int i = 1; i <= 5; i++)
//		{
//			int cnt=1;
//			for (int j = 1; j <= end; j++)
//			{
//				System.out.print(cnt);
//				if(i<=j)
//					cnt--;
//				else
//					cnt++;
//				
//			}
//			System.out.println();
//			end=end+2;
//			
//		}
		
//			
//	}
//}



		
//1
//121
//12321
//1234321
//123454321

//    1
//   121
//  12321
// 1234321
//123454321

		
		int spaceCnt=4;
		int end=5;
		
		for(int i=1;i<=5;i++)
		{
			int cnt1=1;
			for(int j=1;j<=end;j++)
			{
				if(j<=spaceCnt)
					System.out.print(" ");
				else
					if(j<5)
					System.out.print((char)(cnt1++ + 64));
					else
					System.out.print((char) (cnt1-- + 64));
			}
			System.out.println();
			spaceCnt--;
			end++;
		}
	}
}







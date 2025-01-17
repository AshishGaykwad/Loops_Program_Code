package pattern;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ftsp=1;
		int step=5;
	
		int spaceCnt=4;
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=ftsp;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			ftsp++;
			for( i=1;i<=5;i++)
			{
				for(int j=1;j<=step;j++)
				{
					if(j<=spaceCnt)
					System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
				spaceCnt--;
			}
		}
	}
}


//
////*        *
////**      ** 
////***    ***
////****  ****
////**********


  
//      int firsttrianglestartpoint=1;
//      int secondtriangleendpoint=10;
//      
//      for (int i = 1; i <=5; i++)
//      {
//		for (int j = 1; j <= 10; j++)
//		{
//			if(j<=firsttrianglestartpoint || j>=secondtriangleendpoint)
//				System.out.print("*");
//			else
//				System.out.print(" ");
//		}
//		System.out.println();
//		firsttrianglestartpoint++;
//		secondtriangleendpoint--;
//	}
//    }
//}

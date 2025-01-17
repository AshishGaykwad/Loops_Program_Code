package pattern;


public class patternaddsub2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				//CS.6
				int start=5;
				int end=10;
				myCode(start,end);
				
			}

			public static void myCode(int start,int end) 
			{
				int sum = 0;

		        for(int i = start; i <= end; i++ )
		        {
		            if( i % 3 == 0 ) continue;

		            if( i == 8 ) break;

		            sum += i;
		        }

		        System.out.println("sum = " + sum);
			}	
		}

package whileLoop;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123454875;
		int cnt = 0;
//		int sum=0;
		
		while(num>0)
		{
			
			
			cnt++;
			num=num/10;
//			
//			int digit=num%10;
//			sum=sum+digit;
//			num=num/10;
			
//			
		}
//		System.out.println(sum);
		System.out.println(cnt);
	}

}

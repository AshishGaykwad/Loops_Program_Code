package whileLoop;

public class fibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a = 0; 
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 3; i<=n ; i++)
		{
			int c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}

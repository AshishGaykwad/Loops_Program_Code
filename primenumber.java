package forloop;


public class primenumber 
{
	public static void main (String args[])
	{
	 int num = 3;
	 int cnt=0 ;
	 for (int i = 1 ; i<=num;i++)
	 {
		 if (num%i==0)
		 {
			cnt++;
		 }
	 }
	 if (cnt==2)
	 {
		 System.out.println("prime number");
	 }
	 else
	 {
		 System.out.println("not prime number");
	 }
}
}

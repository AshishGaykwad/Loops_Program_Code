package forloop;

public class powerusingloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 3;
		int power = 4;
		int ans = 1;
		for (int i=1;i<=power;i++)
		{
			ans = ans * base;
		}
		System.out.println(ans);
		
		int javamethod = (int) Math.pow(base,power);
		System.out.println(javamethod);
	}

}

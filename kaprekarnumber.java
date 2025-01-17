package forloop;

public class kaprekarnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		int temp=num;
		int cnt=0;
		int square = num*num;
		
		while(num>0)
		{
			num=num/10;
			cnt++;
		}
		int div=(int)Math.pow(10, cnt);
		
		int  fpart=square / div;
		int  spart=square%div;
		
		int sum = fpart+spart;
		
		if(sum==temp)
		{
			System.out.println("kaprekar number");
		}
		else
		{
			System.out.println("not kaprekar number");
		}
	}

}

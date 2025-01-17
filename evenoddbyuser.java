package forloop;
import java.util.*;
public class evenoddbyuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter start number and end number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
			for (int i=a;i<=b;i++ )
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
			
			for (int i=a;i<=b;i++)
			{
				if (i%2!=0)
				{
					
					System.out.println(i);
				}
			}
			sc.close();
		}

}

package nestedforloop;

public class Practisegh {

	public static void main(String[] args) {
Tricky num1=new Tricky(30);
Tricky num2;
num2 =num1.inc();
System.out.print("the program display: ");
System.out.print(num1.num+",");
System.out.print(num2.num+",");
num2=num1.inc();
System.out.print(num2.num);
	}
}
class Tricky {
	int num;
	Tricky(int n){
		num=n;
	}
	Tricky inc() {
		Tricky temp=new Tricky(num+10);
		return temp;
	}
}
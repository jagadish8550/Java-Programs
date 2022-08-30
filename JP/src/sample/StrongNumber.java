package sample;

public class StrongNumber {
	public static void main(String[] args) {
		int num=145;
		int n=num;
		int sum=0;
		//System.out.println(num);
		while(num>0) {
			int rem=num%10;
			int fact=1;
			while(rem>0) {
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num/=10;
		}
		if(n==sum)
			System.out.println("Strong number");
		else
			System.out.println("not Strong");
	}
}

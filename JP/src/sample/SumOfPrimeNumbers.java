package sample;

public class SumOfPrimeNumbers {
	public static void main(String[] args) {
//		 int prime, sum=0;
//		 Scanner sc=new Scanner(System.in);
//		    System.out.println("Enter the Start range: ");
//		    int start= sc.nextInt();
//		    System.out.println("Enter the end range: ");
//		    int end=sc.nextInt();
//		    
//		    for(int i=start; i<=end; i++)
//		    {
//		        prime = 1;
//		        for(int j=2; j<=i/2 ;j++)
//		        {
//		            if(i%j==0)
//		            {
//		                prime = 0;
//		                break;
//		            }
//		        }
//		        if(prime==1)
//		        {
//		            sum += i;
//		        }
//		    }
//		    System.out.println(sum);
		int n=20;
		int sum=0;
		for(int i=2;i<=n;i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if(i%j==0)
					count++;
			}
			if(count==1)
				sum=sum+i;
		}
		System.out.println(sum);
			}
}

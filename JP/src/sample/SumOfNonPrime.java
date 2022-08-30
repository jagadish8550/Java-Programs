package sample;

public class SumOfNonPrime {
	public static void main(String[] args) {
		int sum=0;
		for(int n=2;n<20;n++) {
			int k=2;
			while(k<=n/2) {
				if(n%k==0) {
					sum=sum+n;
					break;
				}
				else
					k++;
			}
		}
		System.out.println(sum);
	}
}

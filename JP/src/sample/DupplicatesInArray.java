package sample;

public class DupplicatesInArray {
	public static void main(String[] args) {
		int a[]= {3,4,2,5,8,2,4,5,3};
		//to sort
		for (int i = 0; i < a.length-1; i++) {
			for (int j=i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//to print without duplicates
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1])
				System.out.print(a[i]+" ");
		}
		System.out.println(a[a.length-1]);
	}
}

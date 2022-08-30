package sample;

public class MissingNumber {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,7,8,9};
		int a=1;
		for(int i=0;i<arr.length;i++) {
			if(a!=arr[i]) {
				System.out.println(a);
				break;
			}
			a++;
		}
	}
	
}

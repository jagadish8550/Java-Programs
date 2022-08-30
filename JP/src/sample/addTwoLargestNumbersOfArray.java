package sample;

import java.util.Arrays;

public class addTwoLargestNumbersOfArray {
	public static void main(String[] args) {
		int a[]= {2,5,7,9,1,6,11,17,15};
		Arrays.sort(a);
		System.out.println(a[a.length-1]+a[a.length-2]);
	}
}

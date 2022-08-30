package sample;

import java.util.Arrays;

public class DuplicatesOfArray {
	public static void main(String[] args) {
		int a[]= {1,2,2,3,4,4,5,6,6,7};
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]==a[i]) {
				a[i+1]=0;
			}
		}
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				count++;
			}
	}
		int index=0;
		int n[]=new int[count];
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				n[index]=a[i];
				index++;
			}
		}
		System.out.print("{");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]);
			if(i<n.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
		}
}

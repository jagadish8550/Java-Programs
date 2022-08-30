package sample;

import java.util.Scanner;

public class Occurance2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int max[]=new int[256];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			max[(int)ch]++;
		}
		for(int i=0;i<256;i++) {
			if(max[i]!=0)
				System.out.println((char)i+" has occurred "+max[i]+" times");
		}
	}
}

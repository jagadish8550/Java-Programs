package sample;

import java.util.Scanner;

public class Char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		char ch[]=new char[size];
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
			int count =0;
			for (int j = 0; j <=i; j++) {
				if(ch[j]<ch[i])
					count++;
			}
			System.out.println(count);
		}
		/*System.out.println(0);
		for(int i=1;i<ch.length;i++) {
			int count=0;
			for(int j=i-1;j>=0;j--) {
				if(ch[i]>ch[j])
					count++;
			}
			System.out.println(count);
		}*/
		sc.close();
	}
}

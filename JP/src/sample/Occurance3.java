package sample;

import java.util.Arrays;

public class Occurance3 {
	public static void main(String[] args) {
		String s="KARNATAKA";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		int count=0;
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
			else {
				count++;
				System.out.println(ch[i]+":"+count);
				count=0;
			}
		}
		count++;
		System.out.println(ch[ch.length-1]+ ":"+count);
	}
}

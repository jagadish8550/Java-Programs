package sample;

import java.util.Arrays;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String s="Test Yantra".toLowerCase().replace(" ", "");
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String s1="";
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]!=ch[i+1]) {
				//System.out.print(ch[i]);
				s1=s1+ch[i];
			}
			//System.out.println(s);
		}
		s1=s1+ch[ch.length-1];
		System.out.println(s1);
		//System.out.print(ch[ch.length-1]);
		//System.out.println(s1);
	}
}

package sample;

public class ReverseParticularWord {
	public static void main(String[] args) {
		String s="my name is Jagadish";
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<s1[1].length();i++) {
			s2=s1[1].charAt(i)+s2;
		}
//		StringBuilder sb=new StringBuilder(s1[1]);
//		sb.reverse();
		s1[1]=s2;
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
		}
	}
}

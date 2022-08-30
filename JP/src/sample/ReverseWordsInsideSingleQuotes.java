package sample;

public class ReverseWordsInsideSingleQuotes {
	public static void main(String[] args) {
		String s="NANNA MANASALLI 'NINAGE' JAGA ILLA"; 
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].charAt(0)=='\'') {
				String s2=s1[i].replace("'", "");
//				StringBuilder sb=new StringBuilder(s2);
//				sb.reverse();
//				System.out.print(sb+" ");
				String s3="";
				for (int j = 0; j < s2.length(); j++) {
					s3=s2.charAt(j)+s3;
				}
				System.out.print(s3+" ");
			}
			else
				System.out.print(s1[i]+" ");
		}
	}
}

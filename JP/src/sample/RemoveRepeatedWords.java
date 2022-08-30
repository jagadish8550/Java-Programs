package sample;

public class RemoveRepeatedWords {
	public static void main(String[] args) {
		String s="HI IM RAM HI I LIVE IN BANGALORE BANGALORE";
		String[] s2 = s.split(" ");
		String s1="";
		for (int i = 0; i < s2.length-1; i++) {
			if(!(s1.contains(s2[i]))) {
				s1=s1+s2[i]+" ";
			}
		}
//		s1=s1.trim();
		System.out.println(s1);
	}
}

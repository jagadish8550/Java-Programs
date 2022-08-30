package sample;

public class OccuranceOfChar {
	public static void main(String[] args) {
		int count=0;
		String s="KARNATAKA";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A')
				count++;
		}
		System.out.println(count);

	}
}

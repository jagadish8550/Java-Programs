package sample;

public class AddDigitsFromString {
	public static void main(String[] args) {
		String s="QDG18JHGWE2937JDB80";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				String temp=s.charAt(i)+"";
				int tempNum=Integer.parseInt(temp);
				sum=sum+tempNum;
			}
		}
		System.out.println(sum);
		
	}
}

package sample;

public class LargestWordInTheString {
	public static void main(String[] args) {
		String s="fun&!! time";
		String str[]=s.split("\\W");
		String largest="";
		for (String word : str) {
			if(word.length()>largest.length())
				largest=word;
		}
		System.out.println(largest);
	}
}

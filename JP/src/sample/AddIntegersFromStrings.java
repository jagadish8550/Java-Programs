package sample;

public class AddIntegersFromStrings {
	public static void main(String[] args) {
		String s="QDG18JHGWE2937JDB80";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			int s2=0;
			String s1;
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				s1=""+s.charAt(i);
				for(int j=i+1;j<s.length();j++,i++) {
					if(!(s.charAt(j)>='0'&&s.charAt(j)<='9'))
						break;
					else {
						s1=s1+s.charAt(j);
					}
				}
				s2=Integer.valueOf(s1);
			}
			sum=sum+s2;
		}
		System.out.println(sum);
	}
}

package sample;

public class SwapStrings {
	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		s1=s1.concat(s2);// helloworld
		s2=s1.substring(0,s1.length()-s2.length());//hello
		s1=s1.substring(s2.length());//world
		System.out.println(s1);
		System.out.println(s2);
		
		int a=23;
		int b=20;
		a=a+b;//43
		b=a-b;//23
		a=a-b;//20
		System.out.println(a);
		System.out.println(b);
	}
}

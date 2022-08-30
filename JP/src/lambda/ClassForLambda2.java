package lambda;

public class ClassForLambda2 {
	public static void main(String[] args) {
		InterfaceForLambda2 i=(a,b)->{
			System.out.println("method-1");
			return a+b;
		};
		
		int sum=i.add(10,20);
		
		System.out.println(sum);
		String s="Hi";
	}
}

package lambda;

public class ClassForLambda {
	public static void main(String[] args) {
		//to create Lambda expression
		//gives implementation directly without implementing in the class
		InterfaceForLambda i=(a)->{
			System.out.println(a);
		};
		
		i.print(10);
	}
}

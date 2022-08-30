package sample;

public class Simple1 {
	
	static void check() {
		System.out.println("static method");
	}
	
	void check1() {
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		Simple1.check();
		Simple1 S1=new Simple1();
		S1.check1();
		
	}
}

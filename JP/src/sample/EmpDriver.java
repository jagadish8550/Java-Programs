package sample;

public class EmpDriver {
	public static void main(String[] args) {
		Emp e=new Emp("hey", 123);
		System.out.println(e.getEmpDetails());
		e.setEmpDetails("hoy", 234);
		System.out.println(e.getEmpDetails());
	}
}

package sample;

import java.util.HashSet;
import java.util.Scanner;

public class StudentMain {
	static HashSet<Student> st=new HashSet<>();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int no=sc.nextInt();
		for(int i=0;i<no;i++) {
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("id: ");
			int id=sc.nextInt();
			st.add(new Student(name, id));
			}
		System.out.println("enter the id of the student:");
		int id=sc.nextInt();
		getDetails(id);
		sc.close();
	}
	static void getDetails(int id) {
		for (Student student : st) {
			int i=Integer.valueOf(student.id);
			if(i==id) {
				System.out.println(student.name);
			}
		}
	}
}

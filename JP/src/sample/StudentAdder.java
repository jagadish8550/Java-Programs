package sample;

import java.util.HashSet;
import java.util.Scanner;

public class StudentAdder {
	HashSet<Student> st=new HashSet<>();
	public void addStudents(int no) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<no;i++) {
		System.out.println("Enter the name: ");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("id: ");
		int id=sc.nextInt();
		st.add(new Student(name, id));
		}
		sc.close();
	}
	
	public String getName(String id) {
		String name="";
		for (Student student : st) {
			if(student.id==Integer.valueOf(id)) {
				name=student.name;
				break;
			}
		}
		return name;
	}
}

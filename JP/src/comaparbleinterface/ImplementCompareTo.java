package comaparbleinterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import sample.Emp;

public class ImplementCompareTo {
//logic to override compareTo to sort the elements
// chevk in Emp class for implementation	
	
	
	public static void main(String[] args) {
		List<Emp> l=new LinkedList<>();
		l.add(new Emp("vani", 2));
		l.add(new Emp("Shree",3));
		l.add(new Emp("M",1));
		
		Collections.sort(l);
		
		for (Emp emp : l) {
			System.out.println(emp);
		}
	}
}

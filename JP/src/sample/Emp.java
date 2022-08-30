package sample;

public class Emp implements Comparable {
	private String name;
	private int eid;
	
	Emp(){}

	public Emp(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	
	public String getEmpDetails() {
		return this.name+" "+this.eid;
	}
	public void setEmpDetails(String name,int id) {
		this.eid=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", eid=" + eid + "]";
	}
	
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if(this.eid==e.eid)
			return 0;
		else if(this.eid>e.eid)
			return 1;
		else
			return -1;
	}
}

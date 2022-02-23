package day9;

import java.util.*;

public class question4 {
	private String name;
	private int age;
	private String dsgn;
	
	
	public question4(String name, int age, String dsgn) {
		this.name = name;
		this.age = age;
		this.dsgn = dsgn;
	}
	
	public String getName() { return name; }
	
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	
	public void setAge(int age) { this.age = age;}
	
	public String getDsgn() { return dsgn; }
	
	public void setDsgn(String dsgn) {this.dsgn = dsgn; }

	
	@Override
	public String toString() {
		return "Employee [" + 
				"name - " + name + '\'' +
				", age - " + age + '\''	+
				", designation - " + dsgn +
				" ] ";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
		if (obj == null || getClass() != obj.getClass ()) return false;
		question4 emp = (question4) obj;
		return age == emp.age && name.equals(emp.name) && dsgn.equals(emp.dsgn);
				
	}
		
	@Override
	public int hashCode() {return Objects.hash(name, age, dsgn);}
	
	public static void main(String[] args) {
		HashMap<question4, Integer> map = new HashMap<question4, Integer>();
		
		question4 e  = new question4("Akhil", 21, "A");
		question4 e1 = new question4("Rahul", 22, "B");
		question4 e2 = new question4("Abhishek", 23, "A");
		question4 e3 = new question4("Ravi", 21, "A");
		question4 e4 = new question4("Gaurav", 22, "B");
		
		map.put(e, 2000);
		map.put(e1, 12000);
		map.put(e2, 21000);
		map.put(e3, 32000);
		map.put(e4, 24000);
		
		for(Map.Entry<question4, Integer> key:map.entrySet()) {
			System.out.println(key + " Salary");
		}	
	}
}
	


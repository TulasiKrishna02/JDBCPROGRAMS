package hashcodeEquals;

import java.util.HashMap;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		// Two onject are same when there roll no is same
		Employee e1 = new Employee("sleep",100);
		Employee e2 = new Employee("sing",100);
		Employee e3 = new Employee("dance",101);
		
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		hm.put(e1, "1");
		hm.put(e2, "2");
		hm.put(e3, "3");
		
		System.out.println("size: " +hm.size());
		
		System.out.println(hm.get(e1));
		System.out.println(hm.get(e2));
		System.out.println(hm.get(e3));
		
	}
}

//hashcode equals
class Employee{
	
	String hobby;
	int rollNo;
	
	public Employee(String hobby,int rollNo) {
		this.hobby = hobby;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return ""+rollNo;
	}
	
	/*public boolean equals(Object obj) {
		if(this.rollNo == ((Employee)obj).rollNo){
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return rollNo;
	}*/
	
}
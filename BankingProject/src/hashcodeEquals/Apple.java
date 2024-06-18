package hashcodeEquals;

import java.util.HashMap;

public class Apple {
	private String color;
 
	public Apple(String color) {
		this.color = color;
	}
 
	public boolean equals(Object obj) {
		if (!(obj instanceof Apple))
			return false;	
		if (obj == this)
			return true;
		return this.color.equals(((Apple) obj).color);
	}
	
	 protected void finalize() throws Throwable {
	        try{
	            System.out.println("Finalize of Sub Class");
	            //release resources, perform cleanup ;
	        }catch(Throwable t){
	            throw t;
	        }finally{
	            System.out.println("Calling finalize of Super Class");
	            super.finalize();
	        }
	      
	    }
 
	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");
		
	   

 
		//hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m.get(new Apple("green")));
	}
}
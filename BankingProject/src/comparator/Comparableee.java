package comparator;
import java.util.ArrayList;
import java.util.Collections;

class HDTV implements Comparable<HDTV> {
	private int size;
	private String brand;

	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compareTo(HDTV tv) {
		//System.out.println(this.getSize() + ""+ tv.getSize());
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else
			return 0;
	}
}

public class Comparableee {
	public static void main(String[] args) {
		HDTV tv1 = new HDTV(55, "Samsung");
		HDTV tv3 = new HDTV(5, "zxczx");
		HDTV tv2 = new HDTV(60, "Sony");
		ArrayList<HDTV> al = new ArrayList<HDTV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
		Collections.sort(al);
		
		for (int i = 0; i < al.size(); i++) {  
			HDTV tv =(HDTV) al.get(i);  
		    System.out.println("Brand name: "+tv.getBrand()+"||"+"size: "+tv.getSize());  
		   }
		if (tv1.compareTo(tv2) > 0) {
			System.out.println(tv1.getBrand() + " is better.");
		} else {
			System.out.println(tv2.getBrand() + " is better.");
		}
	}
}
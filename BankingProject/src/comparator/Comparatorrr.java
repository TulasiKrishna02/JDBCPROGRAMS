package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class HDTVV {
	private int size;
	private String brand;
 
	public HDTVV(int size, String brand) {
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
}
 
class SizeComparator implements Comparator<HDTVV> {
	@Override
	public int compare(HDTVV tv1, HDTVV tv2) {
		System.out.print("tv1.getSize()"+tv1.getSize() + "  ");
		System.out.println("tv2.getSize()"+tv2.getSize());
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
}
 
public class Comparatorrr {
	public static void main(String[] args) {
		HDTVV tv1 = new HDTVV(55, "Samsung");
		HDTVV tv2 = new HDTVV(60, "Sony");
		HDTVV tv3 = new HDTVV(42, "Panasonic");
 
		ArrayList<HDTVV> al = new ArrayList<HDTVV>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);
 
		Collections.sort(al, new SizeComparator());
		for (HDTVV a : al) {
			System.out.println("Brand:" +a.getBrand() + " size:"+ a.getSize());
		}
	}
}
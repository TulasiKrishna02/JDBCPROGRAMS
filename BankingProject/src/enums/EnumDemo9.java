package enums;

enum Br {
	KF(100), RC(50), RO;
	int price;
	Br(int p) {
		this.price = p;
	}
	Br() {
		this.price = 65;
	}
	public int getPrice() {
		return this.price;
	}
}

public class EnumDemo9 {
	public static void main(String[] args) {
		Br[] br = Br.values();
		for(Br b : br){
			System.out.println(b + "----" + b.getPrice());
		}
	}
}

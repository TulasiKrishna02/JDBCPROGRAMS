package enums;

enum Color {
	BLUE, RED {
		public void info() {
			System.out.println("dangerous color");
		}
	},
	Green;
	public void info() {
		System.out.println("universal color");
	}

}

public class EnumDemo9b {

	public static void main(String[] args) {
		Color[] c = Color.values();
		for (Color color : c) {
			System.out.print(color + " : ");
			color.info();
		}
	}

}

package enums;

enum Game {

	CRICKET, TT, BADMINTON, FOOTBALL
}

public class EnumDemo5 {

	public static void main(String[] args) {

		Game[] game = Game.values();

		for (Game g : game) {
			System.out.println("Name of game is: " + g + " and its Ordinal is: " + g.ordinal());
		}
	}
}

// ordinal method is coming from Enum class
// values  method is coming from some internal logic of Enum class that we can't see.
// coz every enum implicitly contains values method
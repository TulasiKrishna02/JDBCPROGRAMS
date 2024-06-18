package reflection;

import java.io.Serializable;

public class UFOEnemyShip extends EnemyShip implements Serializable{

	private String idCode = "100";
	
	private String getPrivate(){
		return "How did you get this";
	}
	
	private String getOtherPrivate(int thisInt, String thatString ){
		return "How did you get here: " + thisInt + " " + thatString;
	}
	
	public UFOEnemyShip(int number, String random){
		System.out.println("You sent :" + number + " " + random);
	}
	
	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		System.out.println("Reference cons called !!");
		this.shipFactory = shipFactory;
	}
	
}

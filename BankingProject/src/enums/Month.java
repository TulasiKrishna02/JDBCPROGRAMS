package enums;

public enum Month {
	JAN, FEB, MAR;
}

enum Beer {
	FC, RC, RO, FO;
}



//Internally it will change to below class:
/*class Beer{
	public static final Beer FC = new Beer();
	public static final Beer RC = new Beer();
	public static final Beer RO = new Beer();
	public static final Beer FO = new Beer();
}*/
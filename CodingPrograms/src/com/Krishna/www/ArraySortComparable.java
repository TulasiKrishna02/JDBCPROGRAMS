package com.Krishna.www;

import java.util.Arrays;

class Fruit implements Comparable<Fruit>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit(String fruitName,String fruitDesc,int quantity) {
		super();
		this.fruitName=fruitName;
		this.fruitDesc=fruitDesc;
		this.quantity=quantity;
	}
	public String getFruitName() {
		return fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public int compareTo(Fruit compareFruit) {
		int compareQuantity=compareFruit.getQuantity();
		
		return this.quantity-compareQuantity;
	}
	
	
	
}

public class ArraySortComparable {

	public static void main(String[] args) {
		
		Fruit[] fruits=new Fruit[4];
		
		Fruit pineapple=new Fruit("pineapple","pineapple description",70);
		Fruit apple=new Fruit("Apple","Apple description",100);
		Fruit orange=new Fruit("orange","orange description",80);
		Fruit banana=new Fruit("Banana","Banana description",90);
		
		fruits[0]= pineapple;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		Arrays.sort(fruits);
		int i=0;
		for(Fruit temp:fruits) {
			System.out.println("Fruits "+ ++i+":"+temp.getFruitName()+",Quantity: "+temp.getQuantity());
		}

	}

}

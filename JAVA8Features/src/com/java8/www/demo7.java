package com.java8.www;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class product
{
 int id;
 String name;
 double price;
 product(int id,String name,double price)
 {
	 this.id=id;
	 this.name=name;
	 this.price=price;
 }
 

}
public class demo7 {

	public static void main(String[] args) {
		
		List<product> productlist=new ArrayList<product>();
		productlist.add(new product(1,"HP",25000));
		productlist.add(new product(2,"DEll",30000));
		productlist.add(new product(3,"lenovo",28000));
		productlist.add(new product(4,"sony",23000));
		productlist.add(new product(1,"Apple",90000));
		productlist.add(new product(1,"deep",25000));
		
		productlist.stream().filter(p->p.price>25000).forEach(pr->System.out.println(pr.price));

	}

}

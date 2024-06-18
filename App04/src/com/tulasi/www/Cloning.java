package com.tulasi.www;

public class Cloning {
	
	    public static void main(String args[]){
	        Rectangle rec=new Rectangle(30,60);
	        System.out.println(rec);

	        Rectangle copy=null;
	        try{
	            System.out.println("creating copy of this object using clone method");
	            copy=rec.clone();
	            System.out.println("copy"+copy);
	        }
	        catch (CloneNotSupportedException ex){
	            System.out.println("cloning is not supported for this object");
	        }
	//testing properties of object returned by clone method in java
	        System.out.println("copy !=rec:"+(copy!=rec));
	        System.out.println("copy.getClass()==rec.getclass():"+(copy.getClass()==rec.getClass()));
	        System.out.println("Copy.equals(rec):"+copy.equals(rec));
	        System.out.println(copy.getClass().hashCode());
	        System.out.println(rec.getClass().hashCode());
	        rec.setHeight(100);
	        rec.setWidth(45);
	        System.out.println("original object"+rec);
	        System.out.println("cloned object:"+copy);


	    }
	}
	class Rectangle implements Cloneable{
	    private int width;
	    private int height;

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    public Rectangle(int width, int height){
	        this.width=width;
	        this.height=height;


	    }
	    public int area(){
	        return height*width;
	    }

	    @Override
	    public String toString() {
	        return String.format("Rectangle[width:%d,height:%d,area:%d]",width,height,area());
	    }
	    @Override
	    protected Rectangle clone()throws CloneNotSupportedException{
	        return (Rectangle) super.clone();
	    }
	    @Override
	    public boolean equals(Object obj){
	        if(obj==null){
	            return false;
	        }
	        if(getClass() !=obj.getClass()){
	            return false;
	        }
	        final Rectangle other = (Rectangle) obj;
	        if(this.width != other.width){
	            return false;
	        }
	        if(this.height!=other.height){
	            return false;
	        }
	        return true;
	    }
	    @Override
	    public int hashCode(){
	        int hash=7;
	        hash =47*hash+this.width;
	        hash=47*hash+this.height;
	        return hash;
	    }
	}



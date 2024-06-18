package com.thread.www;
class Ab{
	public Ab getRef1(){
		Ab a=new Ab();
		return a;
	}
	public Ab getRef2() {
		return this;
	}
	
}

public class Sample {
	public static void main(String args[])
	{
		Ab a=new Ab();
		System.out.println(a);
		System.out.println();
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());
		System.out.println(a.getRef1());
		System.out.println();
		System.out.println(a.getRef2());
		System.out.println(a.getRef2());
		System.out.println(a.getRef2());
	}

}

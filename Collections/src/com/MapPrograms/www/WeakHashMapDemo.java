package com.MapPrograms.www;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String args[])throws Exception
	{
		HashMap m=new HashMap();
		Temp t=new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(10000);
		System.out.println(m);
		
	}

}
class Temp
{
   public String toString()	
   {
	 return "TTemp";
	 
   }
   public void finalize()
   {
	   System.out.println("Finalize method called");
   }

}
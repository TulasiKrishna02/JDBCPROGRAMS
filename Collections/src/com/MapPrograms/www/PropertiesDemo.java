package com.MapPrograms.www;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args)throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.txt");
		p.load(fis);
		String s=p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag", "8888");
		FileOutputStream fos=new FileOutputStream("abc.txt");
		p.store(fos, "updated by Tulasi Krishna Dokku");
		

	}

}

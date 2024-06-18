package com.tulasi.www;

public class Demo7 {
public static void main(String args[])
{
String s="This is tulasi krishna dokku";
s+=" ";String w="";int count=0;
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c!=' ')
{
w=w+c;	

}
else
{
	if(w.endsWith("s"))
	{
		count++;
	}
	
w="";
}
}
System.out.println(count);
}
}

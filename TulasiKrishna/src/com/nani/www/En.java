package com.nani.www;

class Account
{
private long acc_no;
private String name,email;
private float amount;
public void setacc_no(long acc_no)
{
this.acc_no=acc_no;

}
public long getacc_no()
{

return acc_no;
}
public void setname(String name)
{
this.name=name;
}
public String getname()
{
return name;
}
public void setemail(String email)
{
this.email=email;
}
public String getemail()
{
return email;
}
public void setamount(float amount)
{
this.amount=amount;
}
public float getamount()
{
  return amount;
}
}
public class En
{
public static void main(String args[])
{

Account a=new Account();
a.setacc_no(123456789);
a.setname("TULASI KRISHNA");
a.setemail("tulasi@gmail.com");
a.setamount(5689);

System.out.println("Account Number:"+a.getacc_no());
System.out.println("NAme:"+a.getname());
System.out.println("Email:"+a.getemail());
System.out.println("Amount:"+a.getamount());



}



}
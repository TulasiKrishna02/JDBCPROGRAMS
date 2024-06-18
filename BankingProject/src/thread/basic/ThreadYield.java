package thread.basic;

public class ThreadYield
{
   public static void main(String[] args)
   {
      Thread t = new Mythread5();
       
      t.start();
      
      for (int i = 0; i < 10; i++)
      {
         System.out.println("main");
      }
      
   }
}
 
class Mythread5 extends Thread
{
   public void run()
   {
      for (int i = 0; i < 10; i++)
      {
         System.out.println("child");
         Thread.yield();
      }
   }
}

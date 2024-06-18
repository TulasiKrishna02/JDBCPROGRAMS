package thread.basic;

public class ThreadJoin
{
   public static void main(String[] args) throws InterruptedException
   {
      Thread t = new Thread(new Runnable()
         {
            public void run()
            {
               System.out.println("First task started");
               System.out.println("Sleeping for 5 seconds");
               try
               {
                  Thread.sleep(5000);
               } catch (InterruptedException e)
               {
                  e.printStackTrace();
               }
               System.out.println("First task completed");
            }
         });
      Thread t1 = new Thread(new Runnable()
         {
            public void run()
            {
               System.out.println("Second task completed");
            }
         });
      
      t.start(); // Line 15
      
      t.join(); // Line 16
      System.out.println("thread t over , now main thread is starting");
      t1.start();
      System.out.println("End Main");
   }
}

// imp point
// t.join line will be executed by main thread.
// it means main thread has to wait till thread t completes it work
// once thread complete its work , then will continue its work from that line
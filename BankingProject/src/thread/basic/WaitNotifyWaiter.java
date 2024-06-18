package thread.basic;
public class WaitNotifyWaiter implements Runnable{
     
    private WaitNotifyMessage msg;
     
    public WaitNotifyWaiter(WaitNotifyMessage m){
        this.msg=m;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (msg) {
            try{
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
               // msg.wait();
                msg.wait(1000); 
                //Remove this and try also also put Thread.sleep() in WaitNotifyNotifier.java
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+msg.getMsg());
        }
    }
 
}
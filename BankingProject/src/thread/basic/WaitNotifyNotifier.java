package thread.basic;
public class WaitNotifyNotifier implements Runnable {
 
    private WaitNotifyMessage msg;
     
    public WaitNotifyNotifier(WaitNotifyMessage msg) {
        this.msg = msg;
    }
 
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name+" Notifier work done");
                //msg.notify();
                //Thread.sleep(8000);
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }
 
}
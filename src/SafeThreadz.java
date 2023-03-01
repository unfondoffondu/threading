/*
Jeff
CIS18
 */
public class SafeThreadz implements Runnable {
    private Thread t;
    private String threadName;
    SafeThreadz(String name){
        this.threadName = name;
    }
    @Override
    public void run() {
        ThreadSafeLazyInitializedSingleton safe = ThreadSafeLazyInitializedSingleton.getInstance();
        safe.changeSomething(threadName);
    }
    public void start() {
        if (t == null) {
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}

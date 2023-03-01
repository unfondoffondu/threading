/*
Jeff
CIS18
 */
public class Threadz implements Runnable {
    private Thread t;
    private String threadName;
    Threadz(String name){
        threadName = name;
    }
    @Override
    public void run() {
        LazyInitializedSingleton lazy = LazyInitializedSingleton.getInstance();
        System.out.println(this.threadName + "-Singleton Hashcode---" + lazy.hashCode());
    }
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

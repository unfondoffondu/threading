public class SafeThreadz implements Runnable {
    private Thread t;
    private String threadName;
    SafeThreadz(String name){
        this.threadName = name;
    }
    @Override
    public void run() {
        ThreadSafeLazyInitializedSingleton safe = ThreadSafeLazyInitializedSingleton.getInstance();
        System.out.print(t.getName()  + "-Singleton Hashcode---" +  safe.hashCode() + "\n");
    }
    public void start() {
        if (t == null) {
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}

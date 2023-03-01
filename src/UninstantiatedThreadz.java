public class UninstantiatedThreadz implements Runnable {
    private Thread t;
    private String threadName;
    UninstantiatedThreadz(String name){
        threadName = name;
    }
    @Override
    public void run() {

        Uninstantiated.changeSomething(t.getName());
    }
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}


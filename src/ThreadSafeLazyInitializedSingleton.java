/*
Jeff
CIS18
 */
public class ThreadSafeLazyInitializedSingleton  {
    private static int number = 0;
    private static String name = "Thread Safe Singleton";
    private static ThreadSafeLazyInitializedSingleton uniqueInstance = null;
    private ThreadSafeLazyInitializedSingleton(){}
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ThreadSafeLazyInitializedSingleton();
            return uniqueInstance;
        }

        return uniqueInstance;
    }
    public synchronized void changeSomething(String threadName) {
        number ++;
        String numberToString = Integer.toString(number);
        System.out.println(threadName + " --modified-- " + name + "---this.hashcode---" + this.hashCode() + " --Singleton instance variable-- " + numberToString);
    }
}

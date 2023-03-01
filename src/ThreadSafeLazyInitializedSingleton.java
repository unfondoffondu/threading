/*
Jeff
CIS18
 */
public class ThreadSafeLazyInitializedSingleton  {
    private static ThreadSafeLazyInitializedSingleton uniqueInstance = null;
    private ThreadSafeLazyInitializedSingleton(){}
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new ThreadSafeLazyInitializedSingleton();
            return uniqueInstance;
        }
        return uniqueInstance;
    }

}

/*
Jeff
CIS18
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton uniqueInstance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new LazyInitializedSingleton();
        }
        return uniqueInstance;
    }

}

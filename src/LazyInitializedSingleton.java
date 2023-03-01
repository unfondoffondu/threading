
/*
Jeff
CIS18
 */
public class LazyInitializedSingleton {
    private static String name = "Unsafe Threading Singleton";
    private static int number = 0;
    private static LazyInitializedSingleton uniqueInstance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new LazyInitializedSingleton();
        }
        return uniqueInstance;
    }
    public void changeSomething(String threadName) {
        number ++;
        String numberToString = Integer.toString(number);
        System.out.println(threadName + " --modified-- " + name + "---this.hashcode---" + this.hashCode() + " --Singleton instance variable-- " + numberToString);

    }
}

public class Uninstantiated {
    static String name = "---Uninstantiated Class---";
    static int value = 0;
    public static void changeSomething(String threadName) {
        value ++;
        String numberToString = Integer.toString(value);

        System.out.println(threadName + " --modified-- " + name + " --Uninstantiated class instance variable-- " + value);
    }
}

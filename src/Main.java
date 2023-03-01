/*
Jeff
CIS18
 */

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void unsafe() {
        ArrayList<Threadz> threadz = new ArrayList();
        Threadz T1 = new Threadz("Thread1");
        Threadz T2 = new Threadz("Thread2");
        Threadz T3 = new Threadz("Thread3");
        Threadz T4 = new Threadz("Thread4");
        threadz.add(T1);
        threadz.add(T2);
        threadz.add(T3);
        threadz.add(T4);
        for (Threadz thread : threadz){
            thread.start();
        }
    }
    public static void safe() {
        ArrayList<SafeThreadz> safeThreadz = new ArrayList();
        SafeThreadz T1 = new SafeThreadz("Thread1");
        SafeThreadz T2 = new SafeThreadz("Thread2");
        SafeThreadz T3 = new SafeThreadz("Thread3");
        SafeThreadz T4 = new SafeThreadz("Thread4");
        safeThreadz.add(0,T1);
        safeThreadz.add(1,T2);
        safeThreadz.add(2,T3);
        safeThreadz.add(3,T4);
        for (SafeThreadz thread : safeThreadz){
            thread.start();
        }
    }
    private static void uninstantiated() {
        ArrayList<UninstantiatedThreadz> uninstantiatedThreadz = new ArrayList();
        UninstantiatedThreadz T1 = new UninstantiatedThreadz("Thread1");
        UninstantiatedThreadz T2 = new UninstantiatedThreadz("Thread2");
        UninstantiatedThreadz T3 = new UninstantiatedThreadz("Thread3");
        UninstantiatedThreadz T4 = new UninstantiatedThreadz("Thread4");
        uninstantiatedThreadz.add(0,T1);
        uninstantiatedThreadz.add(1,T2);
        uninstantiatedThreadz.add(2,T3);
        uninstantiatedThreadz.add(3,T4);
        for (UninstantiatedThreadz thread : uninstantiatedThreadz){
            thread.start();
        }
    }
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        System.out.println("1)unsafe 2)safe 3)uninstantiated");
        String choice = scanny.nextLine();
        if (Objects.equals(choice, "1")) {
            unsafe();
        } else if (Objects.equals(choice, "2")) {
            safe();
        } else if (Objects.equals(choice, "3")) {
            uninstantiated();
        }
    }


}

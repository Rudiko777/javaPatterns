package pract3;
import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
//    private static volatile SemahoreSet<Integer> set = new SemahoreSet<Integer>();
//    private static final Semaphore sem = new Semaphore(1);
//
//    public static void add_with_lock(){
//        sem.a
//        ArrayList<Integer> list = new ArrayList<>(Set.set);
//        set.set.add(list.get(list.size() - 1) + 1);
//        lock.unlock();
//    }

    public static void main(String[] args) throws Exception {
        SemahoreSet<Integer> set = new SemahoreSet<>();
        Thread one = new Thread(()->{
            for (int i = 0; i < 7; i++) {
                set.add(i);
                System.out.println(i);
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 7; i++) {
                set.add(i);
                System.out.println(i);
            }
        });
        one.start();
        two.start();

        Thread.sleep(3000);
    }
}

package pract4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<Integer> array = new ArrayList<>();
            array.add(1);
            array.add(5);
            array.add(2);
            array.add(10);
            final int result = maxNumInArray(array);
            System.out.println(result);
        });
        //Сначала выведется start
        List<Integer> array = new ArrayList<>();
        array.add(6);
        array.add(3);
        array.add(14);
        array.add(90);
        final int result = maxNumInArray(array);
        System.out.println(result);
    }

    public static int maxNumInArray(List<Integer> array){
        int count = array.get(0);
        for (int i = 1; i < array.size(); i++){
            if (array.get(i) > count) count = array.get(i);
        }
        return count;
    }
}

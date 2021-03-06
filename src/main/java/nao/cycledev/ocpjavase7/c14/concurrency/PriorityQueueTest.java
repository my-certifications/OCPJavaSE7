package nao.cycledev.ocpjavase7.c14.concurrency;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueTest {

    public static void test(){

        final PriorityBlockingQueue<Integer> priorityQueue = new PriorityBlockingQueue<>();

        new Thread(() -> {
            try {
                System.out.println("Removing: " + priorityQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            priorityQueue.add(10);
            System.out.println("Added!!!");
        }).start();
    }
}

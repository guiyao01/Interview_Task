package Basic_Java;

import java.util.LinkedList;
import java.util.Queue;

class Thread_P_C{
    final private static int capacity = 5;
    final private Queue<Integer> queue = new LinkedList<>();

    class Producer extends Thread{
        @Override
        public void run(){
            int value = 0;
            while(true){
                synchronized(queue){
                    while (queue.size() == capacity) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    queue.offer(value);
                    System.out.println("Produce :" + value);
                    value++;
                    queue.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class Customer extends Thread{
        @Override
        public void run(){
            while(true){
                synchronized(queue){
                    while(queue.isEmpty()){
                        try{
                            queue.wait();
                        }catch(InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                    int value = queue.poll();
                    System.out.println("Customer :" + value);
                    queue.notify();
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread_P_C pc = new Thread_P_C();
        new Thread(pc.new Producer()).start();
        new Thread(pc.new Customer()).start();
    }

}

package Basic_Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPool{
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        for(int i = 0;i<=5;i++){
            int taskNum = i;
            threadPool.execute(()->{
                System.out.println("Task :"+taskNum+" by "+Thread.currentThread().getName());
            });
        }
        threadPool.shutdown();
    }
}

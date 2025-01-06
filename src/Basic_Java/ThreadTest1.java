package Basic_Java;

/**
 * 4 threads 2 j++ , 2 j--
 */
public class ThreadTest1 {
    private int j;
    private synchronized void increase(){
        j++;
        System.out.println(Thread.currentThread().getName()+"increase:"+j);
    }
    private synchronized void decrease(){
        j--;
        System.out.println(Thread.currentThread().getName()+"decrease:"+j);
    }

    class Inc implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<100;i++){
                increase();
            }
        }
    }
    class Dec implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<100;i++){
                decrease();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest1 tt = new ThreadTest1();
        Inc inc = tt.new Inc();
        Dec dec = tt.new Dec();
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(inc);
            thread.start();
            thread = new Thread(dec);
            thread.start();
        }
    }
}

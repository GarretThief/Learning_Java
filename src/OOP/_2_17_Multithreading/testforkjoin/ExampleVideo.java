package OOP._2_17_Multithreading.testforkjoin;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Garret on 26.03.2017.
 */
public class ExampleVideo {

    static long numOfOperations = 1_000_000;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0,numOfOperations)));
        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask<Long>{
        long from,to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to-from) <= numOfOperations/numOfThreads){
                long j = 0;
                for (long i = from; i < to; i++) {
                    j += i;
                }
                return j;
            }else{
                long mid = (from+to)/2;
                MyFork firstHalf = new MyFork(from,mid);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(mid+1,to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}

package OOP._2_17_Multithreading.testforkjoin;

import java.util.Random;
import java.util.concurrent.RecursiveTask;

public class SumOfN extends RecursiveTask<Long> {
    int from,to;
    public static final int numOfElements = 100_000_000;
    public static int[] array = new int[numOfElements];

    public SumOfN(int from, int to) {
        this.from = from;
        this.to = to;
    }

    void initArray(){
        Random rand = new Random();
        for (int i = 0; i < SumOfN.numOfElements; i++) {
            array[i] = rand.nextInt(100);
        }
    }

        @Override
        public Long compute() {
            if ((to-from) < 20){
                long localSum = 0;
                for (int i = from; i < to; i++) {
                    localSum += array[i];
                }
                return localSum;
            }else{
                int mid = (from + to) / 2;
                SumOfN firstHalf = new SumOfN(from,mid);
                firstHalf.fork();
                SumOfN secondHalf = new SumOfN(mid+1,to);
                long resultSecond = secondHalf.compute();
                return firstHalf.join() + resultSecond;
            }
        }

}


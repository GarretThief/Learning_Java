package OOP._2_17_Multithreading.testforkjoin;


import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        SumOfN sum = new SumOfN(0,SumOfN.numOfElements);
        sum.initArray();
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(sum));

    }
}

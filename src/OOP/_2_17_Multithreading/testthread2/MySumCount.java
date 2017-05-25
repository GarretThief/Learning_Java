package OOP._2_17_Multithreading.testthread2;

/**
 * Created by Garret on 16.03.2017.
 */
public class MySumCount implements Runnable {
    private int startIndex, stopIndex;
    private long resultSum;
    private int[] arrOfInt = new int[1000];

    @Override
    public void run() {
        for (int i = startIndex; i<=stopIndex; i++)
            resultSum+=arrOfInt[i];
    }

    public int[] getArrOfInt() {
        return arrOfInt;
    }

    public void setArrOfInt(int[] arrOfInt) {
        this.arrOfInt = arrOfInt;
    }

    public long getResultSum() {
        return resultSum;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}

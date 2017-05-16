package OOP._2_17_Multithreading.testthread3;


public class Storage {


    private long count = 0;
    private boolean access = true;

    public boolean hasAccess(){ return access;}

    public void revertAccess(){access = !access;}

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}

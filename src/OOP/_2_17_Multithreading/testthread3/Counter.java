package OOP._2_17_Multithreading.testthread3;

/**
 * Created by Garret on 16.03.2017.
 */
public class Counter implements Runnable{
    private Storage storage;

    public Counter (Storage storage){
        this.storage = storage;
    }

    private void increment() throws InterruptedException{
        synchronized (storage){
            if(!storage.hasAccess())
                storage.wait();
            long countIt = storage.getCount();
            countIt++;
            storage.setCount(countIt);

            storage.revertAccess();
            storage.notifyAll();
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                this.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }


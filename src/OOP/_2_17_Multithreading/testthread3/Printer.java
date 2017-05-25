package OOP._2_17_Multithreading.testthread3;

/**
 * Created by Garret on 16.03.2017.
 */
public class Printer implements Runnable {
    private Storage storage;

    public Printer (Storage storage){
        this.storage = storage;
    }

    private void print() throws InterruptedException{
        synchronized (storage){
            if (storage.hasAccess())
                storage.wait();
            System.out.println(storage.getCount());
            storage.revertAccess();
            storage.notifyAll();
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    }


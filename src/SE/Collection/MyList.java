package SE.Collection;

import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class MyList<T> implements List<T> {
    private final int length = 1_000_000;
    private volatile Object[] myArray = new Object[length];

    @Override
    public int size() {
        synchronized (myArray) {
            int size = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] != null) size++;
                else break;
            }
            return size;
        }
    }

    @Override
    public boolean isEmpty() {
        synchronized (myArray) {
            return size() == 0;
        }
    }

    @Override
    public boolean contains(Object o) {
        synchronized (myArray) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (myArray[i].equals(o)) return true;
            }
            return false;
        }
    }


    @Override
    public Iterator iterator() {
        synchronized (myArray) {
            return new MyIterator();
        }
    }

    @Override
    public Object[] toArray() {
        synchronized (myArray) {
            int size = size();
            Object[] newArray = new Object[size];
            for (int i = 0; i < size; i++)
                newArray[i] = myArray[i];
            return newArray;
        }
    }

    @Override
    public boolean add(T o) {
        synchronized (myArray) {
            int size = size();
            myArray[size] = o;
            if (myArray[size].equals(o)) return true;
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        synchronized (myArray) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (myArray[i].equals(o)) {
                    myArray[i] = null;
                    for (int j = i; j < size; j++) {
                        myArray[j] = myArray[j + 1];
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public boolean addAll(Collection c) {
        synchronized (myArray) {
            int size = size();
            Iterator iterator = c.iterator();
            if (myArray.length - size - c.size() > 0) {
                for (int i = size; i < size + c.size(); i++) {
                    if (iterator.hasNext())
                        myArray[i] = iterator.next();
                }
                return true;
            } else {
                Object[] newArray = new Object[myArray.length + size + c.size()];
                if (myArray[0] != null)
                    for (int i = 0; i < size; i++)
                        newArray[i] = myArray[i];
                for (int i = size; i < size + c.size(); i++) {
                    if (iterator.hasNext())
                        newArray[i] = iterator.next();
                }
                myArray = newArray;
            }
            return false;
        }
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        synchronized (myArray) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (myArray[i] != null) myArray[i] = null;
                else break;
            }
        }
    }

    @Override
    public T get(int index) {
        synchronized (myArray) {
            return (T) myArray[index];
        }
    }

    @Override
    public Object set(int index, Object element) {
        synchronized (myArray) {
            myArray[index] = element;
            return myArray[index];
        }
    }

    @Override
    public void add(int index, Object element) {
        synchronized (myArray) {
            int size = size();
            for (int i = size; i >= index; i--) {
                myArray[i] = myArray[i - 1];
                if (i == index) myArray[i] = element;
            }
        }
    }

    @Override
    public T remove(int index) {
        synchronized (myArray) {
            int size = size();
            T t = (T) myArray[index];
            myArray[index] = null;
            for (int j = index; j < size; j++) {
                myArray[j] = myArray[j + 1];
            }
            return t;
        }
    }

    @Override
    public int indexOf(Object o) {
        synchronized (myArray) {
            int size = size();
            for (int i = 0; i < size; i++)
                if (myArray[i].equals(o)) return i;
            return -1;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        synchronized (myArray) {
            int size = size();
            for (int i = size - 1; i >= 0; i--)
                if (myArray[i].equals(o)) return i;
            return -1;
        }
    }

    @Override
    public ListIterator listIterator() {
        synchronized (myArray) {
            return new MyListIterator();
        }
    }

    @Override
    public ListIterator listIterator(int index) {
        synchronized (myArray) {
            return new MyListIterator(index);
        }
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        synchronized (myArray) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (myArray[i] != null) myArray[i] = null;
                else break;
            }
            int i = 0;
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                myArray[i] = iterator.next();
                i++;
            }

            return false;
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class MyIterator implements Iterator<T> {
        private int karetka = -1;

        @Override
        public boolean hasNext() {
            if (myArray[(karetka + 1)] != null) {
                return true;
            }
            return false;
        }

        @Override
        public T next() {
            karetka++;
            return (T) myArray[karetka];
        }
    }

    private class MyListIterator extends MyIterator implements ListIterator<T> {
        private int karetka = -1;

        public MyListIterator (){}

        public MyListIterator(int karetka) {
            this.karetka = karetka;
        }

        @Override
        public boolean hasPrevious() {
            if (myArray[karetka - 1] != null)
                return true;
            return false;
        }

        @Override
        public T previous() {
            karetka--;
            return (T) myArray[karetka];
        }

        @Override
        public int nextIndex() {
            return ++karetka;
        }

        @Override
        public int previousIndex() {
            return --karetka;
        }

        @Override
        public void remove() {
            int size = size();
            myArray[karetka] = null;
        for (int i = karetka; i<size; i++)
            myArray[i] = myArray[i+1];
        }

        @Override
        public void set(T t) {
            myArray[karetka] = t;
        }

        @Override
        public void add(T t) {
            int size = size();
            myArray[size] = t;
        }
    }
}

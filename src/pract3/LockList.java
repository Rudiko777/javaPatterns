package pract3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockList<T> implements List<T>{
    public final List<T> list;
    private final Lock lock;

    public LockList() {
        list = new ArrayList<>();
        lock = new ReentrantLock();
    }
    @Override
    public int size() {
        lock.lock();
        try {
            return list.size();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        try {
            return list.isEmpty();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        try {
            return list.contains(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Iterator iterator() {
        lock.lock();
        try {
            return list.iterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        try {
            return list.toArray();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean add(T o) {
        lock.lock();
        try {
            list.add(o);
            return true;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        try {
            list.remove(o);
            return true;

        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean addAll(Collection c) {
        lock.lock();
        try {
            return list.addAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean addAll(int index, Collection c) {
        lock.lock();
        try {
            return list.addAll(index, c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void clear() {
        lock.lock();
        try {
            list.clear();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T get(int index) {
        lock.lock();
        try {
            return list.get(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T set(int index, T element) {
        lock.lock();
        try {
            return list.set(index, element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void add(int index, T element) {
        lock.lock();
        try {
            list.add(index, element);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public T remove(int index) {
        lock.lock();
        try {
            return list.remove(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        try {
            return list.indexOf(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        try {
            return list.lastIndexOf(o);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public ListIterator listIterator() {
        lock.lock();
        try {
            return list.listIterator();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public ListIterator listIterator(int index) {
        lock.lock();
        try {
            return list.listIterator(index);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        lock.lock();
        try {
            return list.subList(fromIndex, toIndex);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        lock.lock();
        try {
            return list.retainAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        lock.lock();
        try {
            return list.removeAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        lock.lock();
        try {
            return list.containsAll(c);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object[] toArray(Object[] a) {
        lock.lock();
        try {
            return list.toArray(a);
        } finally {
            lock.unlock();
        }
    }
}

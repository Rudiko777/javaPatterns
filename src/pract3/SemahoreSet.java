package pract3;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.concurrent.*;

public class SemahoreSet<T> implements Set<T>{
    public final Set<T> set;
    public final Semaphore sem;
    public SemahoreSet(){
        set = new HashSet<>();
        sem = new Semaphore(1);
    }
    @Override
    public int size() {
        try {
            sem.acquire();
            return set.size();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        try {
            sem.acquire();
            return set.contains(o);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public Object[] toArray() {
        try {
            sem.acquire();
            return set.toArray();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new Object[0];
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean add(T obj) {
        try {
            sem.acquire();
            set.add(obj);
            sem.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            sem.acquire();
            return set.remove(o);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean addAll(Collection c) {
        try {
            sem.acquire();
            return set.addAll(c);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            set.clear();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean removeAll(Collection c) {
        try {
            sem.acquire();
            return set.removeAll(c);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        try {
            sem.acquire();
            return set.retainAll(c);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public boolean containsAll(Collection c) {
        try {
            sem.acquire();
            return set.containsAll(c);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        } finally {
            sem.release();
        }
    }

    @Override
    public Object[] toArray(Object[] a) {
        try {
            sem.acquire();
            return set.toArray(a);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Arrays.copyOf(a, 0);
        } finally {
            sem.release();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

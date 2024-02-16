package pract2;

@FunctionalInterface
public interface Comparator<T> {
    int compareTo(T object1, T object2);
}

package adt;

public interface LinkedListADT<E> {
    void add(E item);

    E remove();

    int search(E item);

    void sort();

    void print();
}

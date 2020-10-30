package ru.mirea.ivashchenko.pr8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        this.capacity = capacity;
    }

    public BoundedWaitList(int capacity, Collection<E> queue){
        super();
        this.capacity = capacity;
        for (E element: queue) {
            this.add(element);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() >= capacity){
            content.remove();
        }
        content.offer(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}

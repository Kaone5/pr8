package ru.mirea.ivashchenko.pr8;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected Queue<E> content;
    public WaitList(){
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> collection){
        content = new ConcurrentLinkedQueue<>(collection);
    }

    @Override
    public void add(E element) {
        content.offer(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> collection) {
        return content.containsAll(collection);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

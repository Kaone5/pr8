package ru.mirea.ivashchenko.pr8;

public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element){
        content.remove(element);
        content.offer(element);
    }

}

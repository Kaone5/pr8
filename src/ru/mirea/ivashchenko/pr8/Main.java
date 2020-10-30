package ru.mirea.ivashchenko.pr8;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList first = new BoundedWaitList(3 );
        first.add(5);
        first.add(3);
        first.add(9);
        System.out.println(first.toString());
        System.out.println(first.isEmpty());
        System.out.println(first.content.toString());
        first.remove();
        System.out.println(first.content.toString());
        System.out.println(first.containsAll(first.content));
        System.out.println(first.contains(first.content));

        UnfairWaitList second = new UnfairWaitList();
        second.add(6);
        second.add(9);
        second.moveToBack(8);
        System.out.println(second.isEmpty());
        System.out.println(second.content.toString());

    }
}

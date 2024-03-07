package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E> {
    private ArrayList<E> delegate;

    public MyStack() {

        delegate = this;
    }

    public void push(E e) {
        this.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return this.remove(this.size() - 1);
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return this.get(this.size() - 1);
    }

}

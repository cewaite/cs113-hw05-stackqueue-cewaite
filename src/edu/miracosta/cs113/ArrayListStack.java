package edu.miracosta.cs113;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<E> implements StackInterface<E>
{

    private ArrayList<E> stack = new ArrayList<E>();

    public ArrayListStack() {}

    @Override
    public boolean empty()
    {
        return stack.isEmpty();
    }

    @Override
    public E peek() {
        if (stack.isEmpty())
        {
            throw new EmptyStackException();
        }
        return stack.get(0);
    }

    @Override
    public E pop() {
        if (stack.isEmpty())
        {
            throw new EmptyStackException();
        }
        E topItem = stack.get(0);
        stack.remove(0);
        return topItem;
    }

    @Override
    public E push(E obj) {
        stack.add(0, obj);
        return obj;
    }
}

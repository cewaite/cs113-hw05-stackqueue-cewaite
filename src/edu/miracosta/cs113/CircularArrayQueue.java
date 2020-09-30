package edu.miracosta.cs113;

import java.util.*;

public class CircularArrayQueue<E> implements Queue<E> {

    private ArrayList<E> queue = new ArrayList<E>();

    public CircularArrayQueue() {}

    public CircularArrayQueue(int initialCapacity)
    {
        queue.ensureCapacity(initialCapacity);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        if (o == null || isEmpty()) return false;
        // if (o == null || o.getClass() != E) return false;
        for (int i = 0; i < queue.size(); i++)
        {
            if (o == queue.get(i))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        queue.add(e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null || isEmpty())
        {
            throw new NoSuchElementException();
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(E e) {
        queue.add(e);
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        E topObj = queue.get(0);
        queue.remove(0);
        return topObj;
    }

    @Override
    public E poll() {
        if (isEmpty())
        {
            return null;
        }
        return remove();
    }

    @Override
    public E element() {
        if (isEmpty())
        {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }

    @Override
    public E peek() {
        if (isEmpty())
        {
            return null;
        }
        return queue.get(0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircularArrayQueue<?> that = (CircularArrayQueue<?>) o;
        return Objects.equals(queue, that.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue);
    }
}

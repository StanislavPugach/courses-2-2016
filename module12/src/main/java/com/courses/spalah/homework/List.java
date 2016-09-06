package com.courses.spalah.homework;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Stanislav Pugach on 01.09.2016.
 */
public class List<E> implements MyList<E> {
    private int size = 0;
    private Node<E> firstElement;
    private Node<E> lastElement;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else return false;
    }

    @Override
    public boolean add(E element) {
        Node<E> node = new Node<E>(); //null
        node.item = element;

        if (firstElement == null) {
            firstElement = node;
            lastElement = node;
            firstElement.next = lastElement;
            lastElement.previous = firstElement;
            size++;
        } else {
            lastElement.next = node;
            node.previous = lastElement;
            lastElement = node;
            size++;
        }

        return true;
    }

    @Override
    public void add(int index, E element) {
        Node<E> nItem = null; // null
        if (index < size / 2) {
            nItem = firstElement;
            for (int i = 0; i < index; i++) {
                nItem = nItem.next;
            }
        } else {
            nItem = lastElement;
            for (int i = 0; i < size - index; i++) {
                nItem = nItem.previous;
            }
        }
        Node<E> node = new Node<E>(nItem.item, nItem.next, nItem);
        nItem.item = element;
        nItem.next = node;
        size++;
    }

    @Override
    public void remove(int index) {
        Node<E> nItem = firstElement;
        if (index == 0) {
            firstElement = firstElement.next;
            size--;
        } else {
            for (int i = 0; i < index - 1; i++) {
                nItem = nItem.next; //5
            }
            if (nItem.next.next == null) {
                nItem.next = null;
            } else {
                nItem.next = nItem.next.next;
            }
            size--;
        }
    }


    @Override
    public E get(int index) {
        Node<E> nItem = null; // null
        if (index <= size / 2) {
            nItem = firstElement;
            for (int i = 0; i < index; i++) {
                nItem = nItem.next;
            }
        } else {
            nItem = lastElement;
            for (int i = 0; i < size - index; i++) {
                nItem = nItem.previous;
            }
        }
        return nItem.item;
    }

    @Override
    public E set(int index, E element) {
        Node<E> nItem = null; // null
        if (index <= size / 2) {
            nItem = firstElement;
            for (int i = 0; i < index; i++) {
                nItem = nItem.next;
            }
        } else {
            nItem = lastElement;
            for (int i = 0; i < size - index; i++) {
                nItem = nItem.previous;
            }
        }
        E retElement = nItem.item;
        nItem.item = element;
        return retElement;
    }

    @Override
    public boolean contains(E element) {
        boolean result = false;
        Node<E> nItem = firstElement;
        for (int i = 0; i < size; i++) {
            if (nItem.equals(element)) {
                result = true;
                break;
            }
            nItem = nItem.next;
        }
        return result;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private static class Node<N> {
        N item;
        Node<N> next;
        Node<N> previous;

        Node() {
            this.item = null;
            this.next = null;
            this.previous = null;
        }

        Node(N item, Node<N> next, Node<N> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }

        @Override
        public boolean equals(Object obj) {
            return item.equals(obj);
        }
    }

    private class ListIterator implements Iterator<E>{

        private int cursor = 0;
        private Node<E> element;

        public ListIterator(){
            this.element = firstElement;
        }

        @Override
        public boolean hasNext() {
            return cursor < size();
        }

        @Override
        public E next() {
            while (this.hasNext()) {
                E current = element.item;
                cursor++;
                element = element.next;
                return current;
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            List.this.remove(cursor);
            size--;
        }
    }
}

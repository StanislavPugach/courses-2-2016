package com.courses.spalah.homework;

import java.util.Iterator;

/**
 * Created by Stanislav Pugach on 01.09.2016.
 */
public class List<E> implements MyList<E> {
    private int size = 0;
    private Node<E> firstElement;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        else return false;
    }

    @Override
    public boolean add(E element) {
        Node<E> node = new Node<E>();
        node.item = element;

        if (firstElement == null){
            firstElement = node;
            size++;
        }

        else {
            node.next = firstElement;
            firstElement = node;
            size++;
        }
        return true;
    }

    @Override
    public void add(int index, E element) {
        Node<E> nItem = firstElement;
        for (int i = 0; i < index; i++) {
            nItem = nItem.next;
        }
        Node<E> node = new Node<E>(nItem.item, nItem.next);
        nItem.item = element;
        nItem.next = node;
        size++;
    }

    @Override
    public void remove(int index) { //5
        Node<E> nItem = firstElement;
        if (index == 0){
            firstElement = firstElement.next;
            size--;
        }
        else {
            for (int i = 0; i < index - 1; i++) { //3 4
                nItem = nItem.next; //5
            }
            if (nItem.next.next == null){
                nItem.next = null;
            }
            else {
                nItem.next = nItem.next.next;
            }
            size--;
        }
    }


    @Override
    public E get(int index) {
        Node<E> nItem = firstElement;
        for (int i = 0; i < index; i++) {
            nItem = nItem.next;
        }
        return nItem.item;
    }

    @Override
    public E set(int index, E element) {
        Node<E> nItem = firstElement;
        for (int i = 0; i < index; i++) {
            nItem = nItem.next;
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
                if (nItem.item == element) {
                    result = true;
                }
                nItem = nItem.next;
            }
        return result;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return (firstElement.next != null);
            }

            @Override
            public E next() {
                E element = null;
                if (this.hasNext()){
                    element = firstElement.item;
                    firstElement = firstElement.next;
                }
                return element;
            }
        };
    }

    private static class Node<N> {
        N item;
        Node<N> next;

        Node(){
            this.item = null;
            this.next = null;
        }

        Node(N item, Node<N> next){
            this.item = item;
            this.next = next;
        }
    }
}

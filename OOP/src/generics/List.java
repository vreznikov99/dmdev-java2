package generics;

import java.util.Iterator;

public class List<T> implements Iterable<T>{
    private T[] objects;
    private int size;

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element){
        this.objects[size++] = element;
    }

    public T get(int index){
        return this.objects[index];
    }

    public int getSize(){
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T>{
        int currentIndex;
        @Override
        public boolean hasNext() {
            return currentIndex < List.this.size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}

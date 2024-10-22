package generics;

public class List<T> {
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
}

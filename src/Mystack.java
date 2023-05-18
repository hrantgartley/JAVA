package src;

public class Mystack {
    private int size = 0;
    private int[] elements = new int[3];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int elements) {
        this.elements[size++] = elements;
    }

    public int pop() {
        if (isEmpty())
            throw new Underflow();
        return elements[--size];
    }

    public class Underflow extends RuntimeException {

    }
}

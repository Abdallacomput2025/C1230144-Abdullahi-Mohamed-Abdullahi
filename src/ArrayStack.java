import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private static final int DEFAULT = 3;
    private int top;
    private T[] stack;
    
    ArrayStack() {
        this(DEFAULT);
    }

    ArrayStack(int InitialSize) {
        top = 0;
        stack = (T[]) (new Object[InitialSize]);
    }
    
    public void push(T element) {
        if (top == stack.length)
            Expand();
        stack[top] = element;
        top++;
    }
    
    public boolean isEmpty(){
        return top ==0;
    }
   
    public void Expand(){
        stack = Arrays.copyOf(stack,stack.length*2);
    }
   
    public void display() {
        if (isEmpty())
            throw new EmptyStackException();
        else
            System.out.println("Elements of an array: ");
        for (int i = 0; i < top; i++)
            System.out.println(stack[i] + " ");
        System.out.println();
    }
}


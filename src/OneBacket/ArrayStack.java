package OneBacket;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private static final int DEFAULT = 2;
    private int top;
    private T[] stack;
    //No Arg Constructor
    ArrayStack() {
        this(DEFAULT);
    }
    ArrayStack(int InitialSize) {
        top = 0;
        stack = (T[]) (new Object[InitialSize]);
    }
    //size
    public int size() {
        return top;
    }
    //push method
    public void push(T element) {
        if (size() == stack.length)
            Expand();
        stack[top] = element;
        top++;
    }
    //pop method
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        else {
            //top--;
            T Result = stack[--top];
            stack[top] = null;
            return Result;
        }
    }
    //peek MEthod
    public T peek(){
        if (isEmpty())
            throw new EmptyStackException();
        else
            return stack[top-1];
    }
    //isEmpty method
    public boolean isEmpty(){
        return top ==0;
    }
    //expand method
    public void Expand(){
        stack = Arrays.copyOf(stack,stack.length*2);
    }
    //display
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


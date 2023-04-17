package cs2.adt;

import java.util.EmptyStackException;

public class ArrayStack<T> implements Stack<T> {
  private T[] arr;
  private int len;

  public ArrayStack() {
    len = 0;
    arr = (T[])new Object[10];
  }

  public void push(T item) {
    if(len == arr.length) {
      T[] tmp = (T[])new Object[len*2];
      for(int i=0; i<len; i++) {
        tmp[i] = arr[i];
      }
      arr = tmp;
    }
    arr[len] = item;
    len++;
  }
  public T pop() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    len--;
    return arr[len];
  }
  public T peek() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    return arr[len-1];
  }
  public boolean isEmpty() { return len == 0; }
}

package cs2.adt;

public class ArrayStack<T> implements Stack<T> {
  private T[] arr;
  private int len;

  public ArrayStack() {
    len = 0;
    arr = (T[])new Object[10];
  }

  public void push(T item);
  public T pop();
  public T peek();
  public boolean isEmpty();
}

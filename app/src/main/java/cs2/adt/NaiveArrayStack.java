package cs2.adt;

public class NaiveArrayStack<T> implements Stack<T> {
  private T[] arr;

  public NaiveArrayStack() {
    arr = (T[])new Object[0];
  }

  public void push(T item) {
    T[] tmp = (T[])new Object[arr.length + 1];
    for(int i=0; i<arr.length; i++) {
      tmp[i] = arr[i];
    }
    tmp[arr.length] = item;
    arr = tmp;
  }
  public T pop() {
    T[] tmp = (T[])new Object[arr.length - 1];
    for(int i=0; i<tmp.length; i++) {
      tmp[i] = arr[i];
    }
    T retVal = arr[arr.length - 1];
    arr = tmp;
    return retVal;
  }
  public T peek() {
    return arr[arr.length - 1];
  }
  public boolean isEmpty() {
    return arr.length == 0;
  }
}

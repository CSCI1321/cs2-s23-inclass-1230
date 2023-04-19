package cs2.adt;

public class LinkedStack<T> implements Stack<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      this.data = d; this.next = n;
    }
  }

  private Node head;

  public LinkedStack() {
    head = null;
  }

  public void push(T item);
  public T pop();
  public T peek();
  public boolean isEmpty();
}

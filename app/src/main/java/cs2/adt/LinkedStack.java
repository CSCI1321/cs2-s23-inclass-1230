package cs2.adt;

import java.util.EmptyStackException;

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

  public void push(T item) {
    head = new Node(item, head);
  }
  public T pop() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException();
    T retVal = head.data;
    head = head.next;
    return retVal;
  }
  public T peek() throws EmptyStackException {
    if(isEmpty()) throw new EmptyStackException(); 
    return head.data;
  }
  public boolean isEmpty() { return head == null; }
}

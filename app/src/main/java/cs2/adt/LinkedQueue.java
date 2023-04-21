package cs2.adt;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {
  private class Node {
    public T data;
    public Node next;
    public Node(T d, Node n) {
      this.data = d; this.next = n;
    }
  }

  private Node head;
  private Node last;

  public LinkedQueue() {
    head = null;
    last = null;
  }
  
  public void enqueue(T item) {
    if(isEmpty()) {
      head = new Node(item, null);
      last = head;
    } else {
      last.next = new Node(item, null);
      last = last.next;
    }
  }
  public T dequeue() throws NoSuchElementException {
    if(isEmpty()) throw new NoSuchElementException();
    T retVal = head.data;
    head = head.next;
    if(head == null) last = null;
    return retVal;
  }
  public T peek() throws NoSuchElementException {
    if(isEmpty()) throw new NoSuchElementException();
    return head.data;
  }
  public boolean isEmpty() {
    return head == null && last == null;
  }
}

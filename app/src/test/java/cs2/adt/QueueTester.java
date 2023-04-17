package cs2.adt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;

public class QueueTester {
  private Queue<Integer> q;

  @BeforeEach
  void init() {
    //q = new ArrayQueue<Integer>();
  }

  @Test
  void testSingleEnqueueDequeue() {
    assertTrue(q.isEmpty());
    q.enqueue(1);
    assertFalse(q.isEmpty());
    assertEquals(q.peek(), 1);
    assertEquals(q.dequeue(), 1);
    assertTrue(q.isEmpty());
  }

  @Test
  void testMultiEnqueueDequeue() {
    for(int i=1; i<=100; i++) {
      q.enqueue(i);
    }
    for(int i=1; i<=50; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    for(int i=200; i<=300; i++) {
      q.enqueue(i);
    }
    for(int i=51; i<=100; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    for(int i=200; i<=300; i++) {
      assertEquals(q.peek(), i);
      assertEquals(q.dequeue(), i);
    }
    assertTrue(q.isEmpty());
  }

  @Test
  void testExcpetion() {
    try {
      q.peek();
      fail("exception not thrown by peek()");
    } catch (NoSuchElementException e) {
      //Do nothing
    }
    try {
      q.dequeue();
      fail("exception not thrown by dequeue()");
    } catch (NoSuchElementException e) {
      //Do nothing
    }
  }



}

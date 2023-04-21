package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  void init() {
    s = new LinkedStack<Integer>();
  }

  @Test
  void testSinglePushPop() {
    assertTrue(s.isEmpty());
    s.push(1);
    assertFalse(s.isEmpty());
    assertEquals(s.peek(), 1);
    assertEquals(s.pop(), 1);
    assertTrue(s.isEmpty());
  }

  @Test
  void testMultiPushPop() {
    for(int i=1; i<=100; i++) {
      s.push(i);
      assertFalse(s.isEmpty());
    }
    for(int i=100; i>=1; i--) {
      assertEquals(s.peek(), i);
      assertEquals(s.pop(), i);
    }
    assertTrue(s.isEmpty());
  }

  @Test
  void testExcpetion() {
    try {
      s.peek();
      //Getting here is bad
      fail("peek() from empty didn't throw exception");
    } catch(EmptyStackException e) {
      //Getting here is good
    }
    try {
      s.pop();
      //Getting here is bad
      fail("pop() from empty didn't throw exception");
    } catch(EmptyStackException e) {
      //Getting here is good
    }

    s.push(1);
    try {
      s.peek();
      //Getting here is good
    } catch(EmptyStackException e) {
      //Getting here is bad
      fail("peek() threw exception on non-empty stack");
    }
    try {
      s.pop();
      //Getting here is good
    } catch(EmptyStackException e) {
      //Getting here is bad
      fail("pop() threw exception on non-empty stack");
    }
  }

}

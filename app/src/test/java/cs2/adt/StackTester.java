package cs2.adt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StackTester {
  private Stack<Integer> s;

  @BeforeEach
  void init() {
    s = new ArrayStack<Integer>();
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

}

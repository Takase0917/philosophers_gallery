package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
  private RhulStack rs;

  @BeforeEach
  public void setup() { // made for remove code smell
    rs = new RhulStack();
  }

  @Test
  void testSize() {
    RhulStack rs = new RhulStack();
    assertEquals(rs.size(), 0,
        "Test a newly created stack to see that it has size zero."
            + "Test1: made RhulStack class to use instance of them" + "Test2: defined size method"
            + "Test3: return 0 to pass test" + "Test4: change return value to size");
  }

  @Test
  void testPush() {
    rs.push(new Entry(5));
    assertEquals(rs.size(), 1, "Test that push increases the size of an empty stack."
        + "Test1: start with size equals to 1" + "Test2: defined push method" + "Test3: push size 1"
        + "Test4: defined size variable" + "Test5: push method runs size = 1 to pass");
  }



  @Test
  void testPop() {
    rs.push(new Entry(5));
    rs.pop();
    assertEquals(rs.size(), 0,
        "Test that shows pop works properly." + "Test1: start with size equals to 0"
            + "Test2: defined pop method" + "Test3: add return value 0");
  }

  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> rs.pop(),
        "EmptyStackException exception thrown by top and pop." + "Test1: create pop method"
            + "Test2: return 0"
            + "Test3: make if statement to throw exception when stack's size equals 0"
            + "Test4: set value variable to get stack data and pop method return the value"
            + "Test5: change method return type to Type");
  }


  @Test
  void testTop() {
    rs.push(new Entry(5));
    rs.top();
    assertEquals(rs.size(), 1, "Test that shows top works properly" + "Test1: defined top method"
        + "Test2: change stack size to 1");
  }

  //
  @Test
  void pushAndPopThenTop() {
    rs.push(new Entry(5));
    rs.push(new Entry(2));
    rs.pop();
    rs.top();
    assertEquals(rs.top(), 1,
        "" + "Test1: changed return type to int"
            + "Test2: make if statement to throw exception when stack's size equals 0"
            + "Test3: otherwise return size method");
  }

  //
  @Test
  void testEmptyTop() {
    rs.push(new Entry(5));
    rs.pop();
    assertThrows(EmptyStackException.class, () -> rs.top(),
        "EmptyStackException exception thrown by top and pop");
    rs.push(new Entry(0));
  }

  //
  @Test
  void testisEmpty() {
    rs.push(new Entry(0));
    rs.pop();
    assertTrue(rs.isEmpty(),
        "Test isEmpty method is working correctly" + "Test1: defined isEmpty method"
            + "Test2: return null" + "Tsst3: change method return type to boolean"
            + "Test4: if size equals 0 then return true otherwise false");
  }


}
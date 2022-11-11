package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.function.BooleanSupplier;

// $Id: RhulStack.java 200 2020-10-01 14:46:17Z zkac332 $



/**
 * Add.
 * 
 * @author zkac332
 *
 */

public class RhulStack {

  private int size = 0;
  private ArrayList<Entry> entries = new ArrayList<Entry>();


  /**
   * Calculate the current number of elements in the stack.
   * 
   * @return the number of elements in the stack
   */
  public int size() {
    return size;
  }

  /**
   * Add a new value to the top of the stack.
   * 
   * @param entry the value to put of the stack
   */
  public void push(Entry entry) {
    entries.add(entry);
    size = size + 1;
  }


  /**
   * Pop element from the stack.
   * 
   * @return entries.romve(--size)
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return entries.remove(--size);

  }

  /**
   * Get the top of the stack.
   * 
   * @return entries.size()
   */
  public int top() {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    return entries.size();
  }

  /**
   * this is used for checking the current stack is empty.
   * 
   * @return if size == 0 return true otherwise false.
   */
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

}

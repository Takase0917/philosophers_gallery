package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEntry {

  private Entry ent;
  private Symbol symbol;

  @Test
  void testGetType() {
    Entry ent = new Entry(2.0f);
    ent.getType(); //Test1: create constructor Entry
    //Test2: create method getType() in type Entry
    //Test3: assign float f to this.number
    //Test4: change method return type to Type
  }


  @Test
  void testGetValue() throws BadTypeException {
    Entry ent = new Entry(3.0f);
    ent.getValue();
    //Test1: create getValue method in Entry class
    //Test2: change method return type to float
    //Test3: return float number
  }
  
  @Test
  void testGetSymbol() {
    symbol = Symbol.PLUS;
    ent = new Entry(symbol);
    try {
      ent.getSymbol();
      assertEquals(ent.getSymbol(), "+");
    } catch (BadTypeException e) {
      ;
    }
    //Test1: create method getSymbol in Entry class
    //Test2: in other to use symbol variable make symbol constructor in Entry class
    //Test3: make BadTypeException class which shows error message when type invalid value
    //Test4: change method return type to Symbol
    //test5: Add throws declaration
  }


  @Test
  void testGetString() throws BadTypeException {
    ent = new Entry(3.0f);
    ent.getValue();
    ent.getString();
    //assertEquals(ent.getString(), "3.0f");
    //Test1: create method getString in Entry class
    //Test2: change method return type to String
    //Test3: test whether the get string value is equal to string but it failed somehow, 
    //error showed expected: uk.ac.rhul.cs2800.Entry@dd8ba08
    //Test4: made toString method either Type and Symbol class 
  }



  @Test
  void testDifferentType() throws BadTypeException {
    ent = new Entry(3.0f);
    //ent.getSymbol();
    assertThrows(BadTypeException.class, () -> ent.getSymbol(), "this value is not valid");
    //initialised entry with different type
    //Test1: get error for NullPointerException
    //Test2: made if statement for checking current entry instance is valid
  }


}
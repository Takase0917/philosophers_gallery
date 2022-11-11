package uk.ac.rhul.cs2800;

/**
 * this class for identify which type of Entry.
 * 
 * @author Takase
 *
 */
public enum Type {
  NUMBER(3.0f), SYMBOL(Symbol.PLUS), STRING("");

  private float number;
  private Symbol symbol;
  private String str;


  private Type(float number) {
    this.number = number;
  }

  private Type(Symbol symbol) {
    this.symbol = symbol;
  }

  private Type(String str) {
    this.str = str;
  }


  /**
   * toString method.
   *
   */
  public String toString() {
    return this.name();
  }
}
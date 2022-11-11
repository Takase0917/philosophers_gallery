package uk.ac.rhul.cs2800;

/**
 * this class for identify which type of Symbol.
 * 
 * @author Takase
 *
 */
public enum Symbol {
  PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/"), LEFTBRACKET("("), RIGHTBRACKET(")");

  private String symbol;

  private Symbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   * toString method.
   *
   */
  public String toString() {
    return this.name();
  }

}

package uk.ac.rhul.cs2800;

/**
 * Add.
 * 
 * @author Takase
 *
 */
public class Entry {


  private float number;
  private Symbol other;
  private String str;
  private Type type;


  /**
   * this is constructor for float.
   * 
   * @param f
   * 
   */
  public Entry(float f) {
    this.number = f;
  }

  /**
   * this is constructor for Symbol.
   * 
   * @param symbol
   * 
   */
  public Entry(Symbol symbol) {
    this.other = symbol;
  }

  /**
   * Get correct value only when the instance type match with Type.
   * 
   * @return type
   */
  public Type getType() {
    if (!Entry.this.equals(this.type)) {
      ;// i'm not sure what's supposed to do in this case
    }
    return this.type;
  }

  /**
   * This is for get float value. This should be throw exception when the instance type doesn't
   * match with Type. * @return this.number
   * 
   */
  public float getValue() throws BadTypeException {
    return this.number;
  }

  /**
   * Get proper symbol when it is called.
   * 
   * @return this.other
   * @throws BadTypeException
   * 
   */
  @SuppressWarnings("unlikely-arg-type")
public Symbol getSymbol() throws BadTypeException {
    if (!Entry.this.equals(this.other)) {
      throw new BadTypeException("this value is not valid");
    }
    return this.other;
  }



  /**
   * this is used to get string and it shows by the instance of string.
   * 
   * @return toString()
   */
  public String getString() {
    return Entry.this.toString();
  }


}

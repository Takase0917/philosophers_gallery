package uk.ac.rhul.cs2800;

/**
 * This class will be used when other class call this exception.
 * 
 * @author Takase
 *
 */
public class BadTypeException extends Exception {
  /**
   * it has a argument of error message.
   * 
   * @param message
   * 
   */
  public BadTypeException(String message) {
    super(message);
  }
}

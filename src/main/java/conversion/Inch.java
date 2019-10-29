package conversion;

public class Inch extends Unit {

  public Inch(int value) {
    super(value);
  }

  @Override
  public Inch toInch() {
    return this;
  }
}

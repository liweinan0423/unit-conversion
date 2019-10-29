package conversion;

public class Yard extends Unit {

  public Yard(int value) {
    super(value);
  }

  @Override
  public Inch toInch() {
    return new Inch(value * 36);
  }
}

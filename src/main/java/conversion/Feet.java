package conversion;

public class Feet extends Unit {

  public Feet(int value) {
    super(value);
  }

  @Override
  public Inch toInch() {
    return new Inch(this.value * 12);
  }
}

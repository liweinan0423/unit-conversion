package conversion;

public class Mile extends Unit {
  public Mile(int value) {
    super(value);
  }

  @Override
  public Inch toInch() {
    return new Inch(value * 63360);
  }
}

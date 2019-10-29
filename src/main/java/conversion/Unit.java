package conversion;

public abstract class Unit {

  public static Feet feet(int value) {
    return new Feet(value);
  }

  public static Inch inch(int value) {
    return new Inch(value);
  }

  static Yard yard(int value) {
    return new Yard(value);
  }

  static Mile mile(int value) {
    return new Mile(value);
  }

  final int value;

  public Unit(int value) {
    this.value = value;
  }


  public boolean equalsTo(Unit obj) {
    return this.toInch().value == obj.toInch().value;
  }

  public abstract Inch toInch();
}

package conversion;

import org.junit.Test;

import static conversion.Unit.*;

public class UnitConversionTest {
  @Test
  public void one_feet_is_12_inches() {
    assert feet(1).equalsTo(inch(12));
  }

  @Test
  public void _12_inches_is_one_feet() {
    assert inch(12).equalsTo(feet(1));
  }

  @Test
  public void one_yard_is_3_feet() {
    assert yard(1).equalsTo(feet(3));
  }

  @Test
  public void one_mile_is_1760_yard() {
    assert mile(1).equalsTo(yard(1760));
  }
}

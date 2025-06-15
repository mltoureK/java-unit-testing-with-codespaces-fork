
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  public void testSum() {
    int expected = 3;
    int actual = calculator.sum(1, 2);
    assertEquals(expected, actual);
  }

  @Test
  public void testSub() {
    int expected = 10;
    int actual = calculator.subtracting(15, 5);
    assertEquals(expected, actual);
  }

  @Test
  public void multi() {
    int expected = 12;
    int actual = calculator.multiplying(3, 4);
    assertEquals(expected, actual);
  }

  @Test
  public void divi() {
    int expected = 5;
    int actual = calculator.dividing(10, 2);
    assertEquals(expected, actual);
  }
}

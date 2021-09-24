import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void addValuesTest () {
        assertEquals(10, calc.addValues(5,5));
    }
    @Test
    public void subtractValuesTest () {
        assertEquals(15, calc.subtractValues(25,10));
    }
}

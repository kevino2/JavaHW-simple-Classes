import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

private Calculator calculator;
    @Before
        public void setup() { calculator = new Calculator();}

    @Test
    public void testAdd() {
        assertEquals( 5, calculator.add(1,4));
    }

    @Test
    public void testSubtract() {
        assertEquals( 4, calculator.subtract(8,4));
    }

    @Test
    public void testMultiply() {
        assertEquals( 8, calculator.multiply(2,4));
    }

    @Test
    public void testDivide() {
        assertEquals( 3, calculator.divide(9,3));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(5, calculator.subtract(12, 7));
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(5, calculator.divide(10,2));
    }
}

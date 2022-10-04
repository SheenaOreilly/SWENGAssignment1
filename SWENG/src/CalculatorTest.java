import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CalculatorTest
{
    @Test
    public void testConstructor()
    {
        new calculator();
    }

    @Test
    public void testMultiplication()
    {
        assertEquals(calculator.multiplication(1,2), 2);
        assertEquals(calculator.multiplication(5,6), 30);
    }

    @Test
    public void testAddition()
    {
        assertEquals(calculator.addition(5,6), 11);
        assertEquals(calculator.addition(4,0), 4);
    }

    @Test
    public void testSubtraction()
    {
        assertEquals(calculator.addition(7,6), 1);
        assertEquals(calculator.addition(25,5), 20);
    }
}


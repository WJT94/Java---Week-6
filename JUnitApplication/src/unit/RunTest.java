package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RunTest {
    @Test // check if findBig() method returns correct results
    public void runFindBig1() {
        // assertEquals checks if the first argument is equal to the second argument
        assertEquals(200, Calculator.findBig(100, 200));
    }

    public void runFindSmall() {
        assertEquals(10, Calculator.findSmall(10, 20));
    }
}

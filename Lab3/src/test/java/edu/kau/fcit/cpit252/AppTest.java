package edu.kau.fcit.cpit252;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void assertClonesNotEqual() {
        Car c1 = new Car("Honda", "Accord", 2019);
        // Make a clone
        CarFactory carMaker = new CarFactory();
        Car c2 = (Car) carMaker.getClone(c1);
        assertNotEquals(c1, c2);
    }
}

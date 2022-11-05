import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        double[] a = { 1.1, 2.2, 3.3};
        int expected = 3;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        double[] a = { 1.0, 2.0, 3.0};
        int expected = 6;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        double[] a = { 1.0, 2.0, 3.0};
        int expected = 2;
        AverageDoubleArrays obj = new AverageDoubleArrays();

        assertEquals(expected, obj.average(a));
    }
}
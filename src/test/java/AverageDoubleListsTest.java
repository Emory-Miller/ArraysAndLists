import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleListsTest {

    @Test
    void count() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0));
        double expected = 3.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.count(a));
    }

    @Test
    void sum() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.1, 2.0, 3.0));
        double expected = 6.1;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.sum(a));
    }

    @Test
    void average() {
        ArrayList<Double> a = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0));
        double expected = 2.0;
        AverageDoubleLists obj = new AverageDoubleLists();

        assertEquals(expected, obj.average(a));
    }
}
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {

    // write all these out too.

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();

        int[] expected = {4,5,6,11,13,8,9,7,14,18};

        int[] actual = loadAndStore.loadIntArrayFromFile("testIntegerData1.txt");

        assertArrayEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        Integer[] array = {4,5,6,11,13,8,9,7,14,18};

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(array));

        ArrayList<Integer> actual = loadAndStore.loadIntegerArrayListFromFile("testIntegerData1.txt");

        assertEquals(expected, actual);
    }

    @Test
    void loaddoubleArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();

        double[] expected = {4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123};

        double[] actual = loadAndStore.loadDoubleArrayFromFile("testDoubleData2.txt");

        assertArrayEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        Double[] array = {4.4,5.5,6.34,11.0001,13.004,8.7,9.97060,7.4532,14.5,18.00023132123};

        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(array));

        ArrayList<Double> actual = loadAndStore.loadDoubleArrayListFromFile("testDoubleData2.txt");

        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();

        String[] expected = {"4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"};

        String[] actual = loadAndStore.loadStringArrayFromFile("testStringData3.txt");

        assertArrayEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        LoadAndStore loadAndStore = new LoadAndStore();
        String[] array = {"4.4", "5.5", "Foo", "11.0001", "Bar", "Lost in Space", "Lido Shuffle", "How much data was destroyed?", "I think therefore I compute", "0", "NaN", "ZipCode Rocks!"};

        ArrayList<String> expected = new ArrayList<>(Arrays.asList(array));

        ArrayList<String> actual = loadAndStore.loadStringArrayListFromFile("testStringData3.txt");

        assertEquals(expected, actual);
    }
}
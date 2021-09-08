package algo.java.basic.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionTest {

    @Test
    void insertionSort() {
        Insertion insertion = new Insertion();
        assertArrayEquals(new int[]{1,2,3,4}, insertion.InsertionSort(new int[]{4,1,3,2}));
    }
}
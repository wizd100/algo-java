package algo.java.basic.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {

    @Test
    void selectionSort() {
        Selection selection = new Selection();
        assertArrayEquals(new int[]{1,2,3}, selection.selectionSort(new int[]{3,2,1}));
    }
}
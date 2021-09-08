package algo.java.basic.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleTest {

    @Test
    void bubbleSort() {
        Bubble bubble = new Bubble();
        assertArrayEquals(new int[]{1,2,3}, bubble.bubbleSortAsc(new int[]{3,2,1}));
        assertArrayEquals(new int[]{3,2,1}, bubble.bubbleSortDesc(new int[]{3,2,1}));
    }
}
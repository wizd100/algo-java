package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42840Test {

    @Test
    void solution() {
        P42840 p = new P42840();
        assertArrayEquals(new int[]{1}, p.solution(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{1,2,3}, p.solution(new int[]{1,3,2,4,2}));
    }
}
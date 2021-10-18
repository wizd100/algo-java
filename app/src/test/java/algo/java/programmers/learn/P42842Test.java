package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42842Test {

    @Test
    void solution() {
        P42842 p = new P42842();
        assertArrayEquals(new int[]{4, 3}, p.solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, p.solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, p.solution(24, 24));
    }
}
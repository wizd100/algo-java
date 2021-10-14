package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42746Test {

    @Test
    void solution() {
        P42746 p = new P42746();
        assertEquals("6210", p.solution(new int[]{6, 10, 2}));
        assertEquals("9534330", p.solution(new int[]{3, 30, 34, 5, 9}));
        assertEquals("0", p.solution(new int[]{0, 0}));
    }
}
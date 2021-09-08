package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42748Test {

    @Test
    void solution() {
        P42748 p = new P42748();
        assertArrayEquals(new int[]{5, 6, 3}, p.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
    }
}
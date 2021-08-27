package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P12982Test {

    @Test
    void solution() {
        P12982 sol = new P12982();
        assertEquals(3, sol.solution(new int[]{1,3,2,5,4}, 9));
        assertEquals(4, sol.solution(new int[]{2,2,3,3}, 10));
    }
}
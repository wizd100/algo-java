package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42885Test {

    @Test
    void solution() {
        P42885 p = new P42885();
        assertEquals(3, p.solution(new int[]{70, 50, 80, 50}, 100));
        assertEquals(3, p.solution(new int[]{70, 80, 50}, 100));
    }
}
package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P84512Test {

    @Test
    void solution() {
        P84512 p = new P84512();
        assertEquals(6, p.solution("AAAAE"));
        assertEquals(10, p.solution("AAAE"));
        assertEquals(1563, p.solution("I"));
        assertEquals(1189, p.solution("EIO"));
    }
}
package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42839Test {

    @Test
    void solution() {
        P42839 p = new P42839();
        assertEquals(3, p.solution("17"));
        assertEquals(2, p.solution("011"));
    }
}
package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42860Test {

    @Test
    void solution() {
        P42860 p = new P42860();
        assertEquals(11, p.solution("JAAZ"));
        assertEquals(56, p.solution("JEROEN"));
        assertEquals(23, p.solution("JAN"));
        assertEquals(11, p.solution("JAZ"));
    }
}
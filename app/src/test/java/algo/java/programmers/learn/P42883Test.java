package algo.java.programmers.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P42883Test {

    @Test
    void solution() {
        P42883 p = new P42883();
        assertEquals("94", p.solution("1924", 2));
        assertEquals("3234", p.solution("1231234", 3));
        assertEquals("775841", p.solution("4177252841", 4));
    }
}
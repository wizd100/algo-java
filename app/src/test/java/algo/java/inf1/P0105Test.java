package algo.java.inf1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0105Test {

    @Test
    void solution() {
        P0105 p = new P0105();
        assertEquals("S#T!EG*b@a", p.solution("a#b!GE*T@S"));
    }
}
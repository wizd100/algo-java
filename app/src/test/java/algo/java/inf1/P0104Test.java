package algo.java.inf1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0104Test {

    @Test
    void solution() {
        P0104 p = new P0104();
        assertArrayEquals(new String[]{"doog", "emiT", "giB"}, p.solution(3, new String[]{"good", "Time", "Big"}));
    }
}